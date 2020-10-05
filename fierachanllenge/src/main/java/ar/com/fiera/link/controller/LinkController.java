package ar.com.fiera.link.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ar.com.fiera.link.entity.LinkEntity;
import ar.com.fiera.link.service.Impl.LinkServiceImpl;

@RestController
@RequestMapping("/link")

public class LinkController
{

	@Autowired
	LinkServiceImpl service;
	
	public LinkController() {}	
	
	public LinkController(LinkServiceImpl service)
	{
		this.service=service;
	}
	
	@GetMapping
	public List<LinkEntity> getAllLinks()
	{
		List<LinkEntity> response = service.GetAllLinks();
		return response;
	}
	
}
