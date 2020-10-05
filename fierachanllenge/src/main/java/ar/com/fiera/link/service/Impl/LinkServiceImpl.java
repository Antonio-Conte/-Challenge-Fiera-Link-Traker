package ar.com.fiera.link.service.Impl;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public LinkEntity GetLink(Integer element)
	{
		if (!repository.existsById(element))
			return null;
		return repository.getOne(element);	
	}
	
	
	public LinkEntity MaskLink(LinkEntity element) 
	{
		repository.save(element);	
		return GetLink(element.getId());
	}
	
	public int GetClicks(URL link) 
	{
		return 2;
	}
	public void DeleteLink(LinkEntity link) 
	{
		
	}

	public LinkEntity GetClicks() 
	{
		
		return null;
	}
	
	
	
}
