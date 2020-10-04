package ar.com.fiera.link.service.Impl;

import java.net.URL;

import ar.com.fiera.link.DTO.LinkDTO;

public interface LinkServiceImpl
{
	
	public URL MaskLink();
	public LinkDTO GetClicks();
	public void DeleteLink(LinkDTO link);
	
}
