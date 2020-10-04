package principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import config.SwaggerConfig;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class Main{

	//private static long id = 0;


	public static void main(final String[] args ){
		SpringApplication.run(Main.class);
	}
	
}
	