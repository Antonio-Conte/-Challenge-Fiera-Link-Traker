package ar.com.fiera.link.controller;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import ar.com.fiera.link.entity.LinkEntity;
import ar.com.fiera.link.service.LinkService;
import ar.com.fiera.link.service.Impl.LinkServiceImpl;

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
	public LinkEntity MaskLink(@RequestBody final int id, final String url) 
	{
		 LinkEntity newLink= new LinkEntity(id,url,0,null);
	     LinkEntity response= service.MaskLink(newLink);
	     return response;
	}
	@GetMapping("/{link}")
	public ModelAndView  redirect( @PathVariable(name = "link")final String link) 
	{
		String Newlink= service.getLink(link);
		if(Newlink.equals(" "))
			return null;
			 
		 return new ModelAndView("redirect:https://" + Newlink);
	}
	
	
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
