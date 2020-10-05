package ar.com.fiera.link.service.Impl;

import java.sql.Date;
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

	@Override
	public List<LinkEntity> GetAllLinks()
	{
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x ->  x.getStatus()==true)
				.forEach(response::add);
		return response;		
	}
	@Override
	public LinkEntity GetLinkById(Integer element)
	{
		if (!repository.existsById(element))
			return null;
		return repository.getOne(element);	
	}
	@Override
	public String GetLinkByMask(String link) 
	{
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x -> x.getOutput().equals(link)&& x.getStatus()==true)
				.forEach(response::add);
	if(response.isEmpty())return " ";
		response.get(0).addClick();
		repository.save(response.get(0));
		
		return response.get(0).getInput();
		
	}
	
	
	@Override
	public LinkEntity MaskLink(LinkEntity element) 
	{
		repository.save(element);	
		return GetLinkById(element.getId());
	}
	
	
	@Override
	public Date GetDate(String link) 
	{
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x -> x.getOutput().equals(link)&& x.getStatus()==true)
				.forEach(response::add);
			if(response.isEmpty())return new Date(1/1/1);
		
		return response.get(0).getVencimiento();
	}
	
	@Override
	public int GetClicks(String link) 
	{
		
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x -> x.getOutput().equals(link))
				.forEach(response::add);
		
		return response.get(0).getClicks();	
		
	}
	
	@Override
	public void DeleteLink(String link) 
	{
		List<LinkEntity> response = new ArrayList<>();
		repository.findAll().stream().filter(x -> x.getOutput().equals(link))
				.forEach(response::add);
		response.get(0).setStatus(false);
		repository.save(response.get(0));
		
	}
	
	
	
	
}
