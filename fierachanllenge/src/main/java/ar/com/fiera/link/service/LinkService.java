package ar.com.fiera.link.service;

import java.net.URL;
import java.util.List;

import ar.com.fiera.link.DTO.LinkDTO;
import ar.com.fiera.link.entity.LinkEntity;

public interface LinkService 
{
	public List<LinkEntity> GetAllLinks();
	public String MaskLink();
	public LinkDTO GetClicks();
	public void DeleteLink(LinkDTO link);
}
