/**
 * 
 */
package fi.hh.SWD4TN022.saapaivakirja.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import fi.hh.SWD4TN022.saapaivakirja.domain.Weather;
import fi.hh.SWD4TN022.saapaivakirja.domain.WeatherRepository;

/**
 * @author 
 *
 */
@Controller
@EnableAutoConfiguration
@CrossOrigin
public class WeatherController {
	
	@Autowired
	private WeatherRepository repository;
	
	// RESTful service to get all weathers returns a list of weathers
	// Note, we are using Spring Boot 1.x as defined by teacher, do methods
	// accordingly
	@RequestMapping(value = "/weathers", method = RequestMethod.GET)
	public @ResponseBody List<Weather> weatherListRest() {
		return (List<Weather>) repository.findAll();
	}
	
	// RESTful service to get one weather by id
	@RequestMapping(value = "/weather/{id}", method = RequestMethod.GET)
	public @ResponseBody Weather findQuestionRest(@PathVariable("id") Long weatherId) {
		return repository.findOne(weatherId);
	}
	
	// Save new weathers, returns saved weathers with ids
    @RequestMapping(value = "/weathers/{weather_id}/weathers", method = RequestMethod.POST)
    @ResponseStatus( HttpStatus.CREATED )
    public @ResponseBody List<Weather> addNewWeatherList(@RequestBody List<Weather> weathers){
    	ArrayList<Weather> savedWeathers = new ArrayList<Weather>();
    	for (int i=0;i<weathers.size();i++){
    		repository.save(weathers.get(i));
    		savedWeathers.add(weathers.get(i));
		}
    	return savedWeathers;
    } 
	
	// Save new weathers, won't return anything
    @RequestMapping(value = "/questionnaires/{questionnaire_id}/weathersold", method = RequestMethod.POST)
    @ResponseStatus( HttpStatus.CREATED )
    public @ResponseBody void addNewWeatherListOld(@RequestBody List<Weather> weathers){
    	
    	for (int i=0;i<weathers.size();i++){
    		repository.save(weathers.get(i));
		}
    }  
	
	// Save new weather
    @RequestMapping(value = "/questions/{id}/weather", method = RequestMethod.POST)
    @ResponseStatus( HttpStatus.CREATED )
    public @ResponseBody Weather addNewWeather(@RequestBody Weather weather){    	
        repository.save(weather);
        return weather;
    }

}
