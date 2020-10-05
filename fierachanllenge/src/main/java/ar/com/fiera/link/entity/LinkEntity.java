package ar.com.fiera.link.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "links")
public class LinkEntity {
	@Id
	@Column(name="Li_ID")
	private int id;
	@Column(name="Li_INPUT")
	private String input;
	@Column(name="Li_OUTPUT")
	private String output;
	@Column(name="Li_CLICKS")
	private int clicks;
	@Column(name="Li_VENCIMIENTO")
	private Date vencimiento;
	
	
	public LinkEntity(int id, String input, int clicks, Date vencimiento) 
	{
		this.id=id;
		this.input=input;
		output="localhost:9099/Links/v1/"+LinkToMask(input,8);
		this.clicks=clicks;
		this.vencimiento=vencimiento;
	}
	
	public LinkEntity() {}
	
	public void setId(int newId) {
		id=newId;
	}
	
	public int getId() {
		return id;
	}
	
	public void setInput(String newInput) {
		input=newInput;
	}
	
	public String getInput() {
		return input;
	}
	
	public void setId(String newOutput) {
		output=newOutput;
	}
	
	public String getOutput() {
		return output;
	}
	
	public void setClick(int newClick) {
		clicks=newClick;
	}
	
	public int getClicks() {
		return clicks;
	}
	
	public void setVencimiento(Date newVencimiento) {
		vencimiento=newVencimiento;
	}
	
	public Date getVencimiento() {
		return vencimiento;
	}

	
	public boolean getStatus() {
		return true;
	}
	
	 
	public static String LinkToMask(String key, int length) {
				String mask = ""; 
		 
		         for (int i=0; i<8; i++){ 
		
		         int codigoAscii = (int)Math.floor(Math.random()*(122 -
		         97)+97); 
		         mask = mask + (char)codigoAscii; 
		         } 
		         return mask; 
	}
}
