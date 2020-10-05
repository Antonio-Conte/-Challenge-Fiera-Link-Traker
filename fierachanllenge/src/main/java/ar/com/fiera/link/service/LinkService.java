package ar.com.fiera.link.service;

import java.util.List;

import ar.com.fiera.link.entity.LinkEntity;

public interface LinkService 
{
	public List<LinkEntity> GetAllLinks();
	public LinkEntity MaskLink(LinkEntity Url);
	public LinkEntity GetClicks();
	public void DeleteLink(LinkEntity link);
}
