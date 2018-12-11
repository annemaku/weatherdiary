package fi.haagahelia.spring.weatherdiary.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fi.haagahelia.spring.weatherdiary.domain.Weather;
import fi.haagahelia.spring.weatherdiary.domain.WeatherRepository;

@RestController
public class WeatherController {
	
	@Autowired
	private WeatherRepository repository;
	
	
	@RequestMapping("/weathers")
    public Iterable<Weather> getWeathers() {
		
		return repository.findAll();

    } 

}
