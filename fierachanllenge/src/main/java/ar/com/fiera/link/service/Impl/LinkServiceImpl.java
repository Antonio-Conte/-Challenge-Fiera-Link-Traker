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
	
	
	public void DeleteLink(String link) 
	{
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x -> x.getOutput().equals(link))
				.forEach(response::add);
		response.get(0).setStatus(false);
		repository.save(response.get(0));
		
	}

	public int GetClicks(String link) 
	{
		
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x -> x.getOutput().equals(link))
				.forEach(response::add);
		
		return response.get(0).getClicks();	}
	

	@Override
	public String getLink(String link) 
	{
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x -> x.getOutput().equals(link)&& x.getStatus()==true)
				.forEach(response::add);
	if(response.isEmpty())return " ";
		response.get(0).addClick();
		repository.save(response.get(0));
		
		return response.get(0).getInput();
		
	}
	
	
	
}
