package ar.com.fiera.link.service;

import java.sql.Date;
import java.util.List;

import ar.com.fiera.link.entity.LinkEntity;

public interface LinkService 
{
	public List<LinkEntity> GetAllLinks();
	public String GetLinkByMask(String link);
	public LinkEntity GetLinkById(Integer element);
	public LinkEntity MaskLink(LinkEntity Url);
	public int GetClicks(String Link);
	public void DeleteLink(String link);
	public Date GetDate(String link);

}
