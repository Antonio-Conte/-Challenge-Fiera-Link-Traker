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
	private URL input;
	@Column(name="Li_OUTPUT")
	private URL output;
	@Column(name="Li_CLICK")
	private int clicks;
	@Column(name="Li_VENCIMIENTO")
	private Date vencimiento;
	
	public LinkEntity(int id, URL input, URL output, int clicks, Date vencimiento) 
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
	
	public void setInput(URL newInput) {
		input=newInput;
	}
	
	public URL getInput() {
		return input;
	}
	
	public void setId(URL newOutput) {
		output=newOutput;
	}
	
	public URL getOutput() {
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
}
