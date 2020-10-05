package ar.com.fiera.link;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import ar.com.fiera.link.config.SwaggerConfig;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class Main
{



	public static void main(final String[] args )
	{
		SpringApplication.run(Main.class);
	}
	
}
	