package fi.haagahelia.spring.weatherdiary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class WeatherdiaryApplication extends SpringBootServletInitializer{
	
	protected SpringApplicationBuilder configure
    (SpringApplicationBuilder application) {
    return application.sources(WeatherdiaryApplication.class);
}
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WeatherdiaryApplication.class, args);
	}

}
