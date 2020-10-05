package ar.com.fiera.link.controller;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ar.com.fiera.link.entity.LinkEntity;
import ar.com.fiera.link.service.LinkService;

@RestController
@RequestMapping("/link")

public class LinkController 
{

	@Autowired
	LinkService service;
	
	public LinkController() {}	
	
	public LinkController(LinkService service)
	{
		this.service=service;
	}
	
	@GetMapping
	public List<LinkEntity> getAllLinks()
	{
		List<LinkEntity> response = service.GetAllLinks();
		return response;
	}
	
	@PostMapping
	public LinkEntity MaskLink( @RequestBody final int id, final String url,Date vencimiento) 
	{
		 LinkEntity newLink= new LinkEntity(id,url,0,vencimiento);
	     LinkEntity response= service.MaskLink(newLink);
	     return response;
	}
	
	@GetMapping("/{link}")
	public ModelAndView  redirect( @PathVariable(name = "link")final String link) 
	{
		String Newlink= service.GetLinkByMask(link);
		if(Newlink.equals(" "))
			return null;
		 Calendar currenttime = Calendar.getInstance();
		Date Today = new Date((currenttime.getTime()).getTime());
		if(service.GetDate(link).after(Today))
		 return new ModelAndView("redirect:https://" + Newlink);
		 return new ModelAndView("redirect:404" );	}
	
	
	@GetMapping("/clicks/{link}")
	public int ClickOnLinks( @PathVariable(name = "link")final String link)
	{
		int response = service.GetClicks(link);
		return response;
	}
	
	@PutMapping("/{link}")
	public void DeleteLink( @PathVariable(name = "link")final String link)
	{
		service.DeleteLink(link);
	}
	
	
}
