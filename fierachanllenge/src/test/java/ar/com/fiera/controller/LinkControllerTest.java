package ar.com.fiera.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.when;

import java.sql.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import ar.com.fiera.link.controller.LinkController;
import ar.com.fiera.link.entity.LinkEntity;
import ar.com.fiera.link.service.LinkService;
import ar.com.fiera.link.service.Impl.LinkServiceImpl;

public class LinkControllerTest 
{

	
	@Mock
	private LinkService service;

	@InjectMocks
	private LinkController controller;
	
	@BeforeEach
	void setup()
	{
		service = Mockito.mock(LinkServiceImpl.class);
		controller = new LinkController(service);
	}
	
	@Test
	@DisplayName("Mask Links")
	void MaskLinkTest()
	{
		Date a=null;
		LinkEntity linkTest= new LinkEntity(1,"www.google.com", 0, a);
		when(service.MaskLink(linkTest)).thenReturn(linkTest);
		
		LinkEntity response = service.MaskLink(linkTest);
		assertNotNull(response);
		System.out.println("String generado: "+ linkTest.getOutput());

		
		
	}
	@Test
	@DisplayName("Delete Links")
	void DeleteLinkTest() 
	{
		
	}
}
