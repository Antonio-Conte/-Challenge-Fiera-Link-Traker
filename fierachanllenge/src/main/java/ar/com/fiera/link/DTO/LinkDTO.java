package ar.com.fiera.link.DTO;

import java.io.Serializable;
import java.net.URL;
import java.sql.Date;


public class LinkDTO implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String input;
	private String output;
	private int clicks;
	private Date vencimiento;
	private boolean status;
	
	public LinkDTO(int id, String input, String output, int clicks, Date vencimiento, boolean status) 
	{
		this.id=id;
		this.input=input;
		this.output=output;
		this.clicks=clicks;
		this.vencimiento=vencimiento;
		this.status= status;
	}
	
	public LinkDTO() {}
	
	public void setId(int newId)
	{
		id=newId;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setInput(String newInput)
	{
		input=newInput;
	}
	
	public String getInput()
	{
		return input;
	}
	
	public void setId(String newOutput) 
	{
		output=newOutput;
	}
	
	public String getOutput() 
	{
		return output;
	}
	
	public void setClick(int newClick) 
	{
		clicks=newClick;
	}
	
	public int getClicks()
	{
		return clicks;
	}
	
	public void setVencimiento(Date newVencimiento) {
		vencimiento=newVencimiento;
	}
	
	public Date getVencimiento() {
		return vencimiento;
	}

	public boolean getStatus() {
		return false;
	}
	
	public void setStatus(boolean newStatus) {
		status=newStatus;
	}

}
