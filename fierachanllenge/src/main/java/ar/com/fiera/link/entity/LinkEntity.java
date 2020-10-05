package ar.com.fiera.link.entity;

import java.net.URL;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Link")
public class LinkEntity {
	@Id
	@Column(name="Li_ID")
	private int id;
	@Column(name="Li_INPUT")
	private String input;
	@Column(name="Li_OUTPUT")
	private String output;
	@Column(name="Li_CLICK")
	private int clicks;
	@Column(name="Li_VENCIMIENTO")
	private Date vencimiento;
	
	public LinkEntity(int id, String input, String output, int clicks, Date vencimiento) 
	{
		this.id=id;
		this.input=input;
		this.output=output;
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
		// TODO Auto-generated method stub
		return false;
	}
}
