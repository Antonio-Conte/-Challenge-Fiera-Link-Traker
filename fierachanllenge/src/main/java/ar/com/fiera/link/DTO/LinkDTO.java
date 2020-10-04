package ar.com.fiera.link.DTO;

import java.io.Serializable;
import java.net.URL;
import java.sql.Date;


public class LinkDTO implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private URL input;
	private URL output;
	private int clicks;
	private Date vencimiento;
	
	public LinkDTO(int id, URL input, URL output, int clicks, Date vencimiento) 
	{
		this.id=id;
		this.input=input;
		this.output=output;
		this.clicks=clicks;
		this.vencimiento=vencimiento;
	}
	
	public LinkDTO() {}
	
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
