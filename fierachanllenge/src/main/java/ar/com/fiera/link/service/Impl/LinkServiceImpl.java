package ar.com.fiera.link.service.Impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.fiera.link.DTO.LinkDTO;
import ar.com.fiera.link.entity.LinkEntity;
import ar.com.fiera.link.repository.LinkRepository;
import ar.com.fiera.link.service.LinkService;

@Service
public class LinkServiceImpl implements LinkService
{
	@Autowired
	private LinkRepository repository;
	
	public LinkServiceImpl(LinkRepository repository) 
	{
		this.repository=repository;
	}
	
	public List<LinkEntity> GetAllLinks()
	{
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x ->  x.getStatus()==true)
				.forEach(response::add);

		return response;		
	}
	public String MaskLink() 
	{
		String a = null;
		return a;
	}
	public int GetClicks(URL link) 
	{
		return 2;
	}
	public void DeleteLink(LinkDTO link) 
	{
		
	}

	public LinkDTO GetClicks() 
	{
		
		return null;
	}
	
}
