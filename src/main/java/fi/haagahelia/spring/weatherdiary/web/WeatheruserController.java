package fi.hh.SWD4TN022.saapaivakirja.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.hh.SWD4TN022.saapaivakirja.domain.Weatheruser;
import fi.hh.SWD4TN022.saapaivakirja.domain.WeatheruserRepository;

@Controller
@EnableAutoConfiguration
@CrossOrigin
public class WeatheruserController {

	@Autowired
	private WeatheruserRepository repository;

	// RESTful service to get all weathers returns a list of weatherweatherusers
	// Note, we are using Spring Boot 1.x as defined by teacher, do methods
	// accordingly
	@RequestMapping(value = "/weatherweatherusers", method = RequestMethod.GET)
	public @ResponseBody List<Weatheruser> weatherweatheruserListRest() {
		return (List<Weatheruser>) repository.findAll();
	}

	// RESTful service to get one weatherweatheruser by id
	@RequestMapping(value = "/weatherweatherusers/{id}", method = RequestMethod.GET)
	public @ResponseBody Weatheruser findWeatheruserRest(@PathVariable("id") Long weatherweatheruserId) {
		return repository.findOne(weatherweatheruserId);
	}

	// RESTful service to get all weatherweatherusers by weatherweatherusernaire returns a list of weatherweatherusers
	@RequestMapping(value = "/weatherusernaires/{weatherweatherusernaireid}/weatherweatherusers", method = RequestMethod.GET)
	public @ResponseBody List<Weatheruser> weatherweatheruserListRestByWeatherusernaire(@PathVariable("weatheruserid") Long weatheruserId) {
		return repository.findByWeatheruserId(weatheruserId);
	}
	
	 @RequestMapping(value= "/proto/restapi", method=RequestMethod.GET)
		public String REST_API(){
			return "proto.restapi";
		}
	 
	 @RequestMapping(value= "/restapi", method=RequestMethod.GET)
		public String h_REST_API(){
			return "restapi";
		}
	 
	// RESTful service to get all answers by weatherweatheruser returns a list of answers
	@RequestMapping(value = "/weatherweatherusers/{id}/answers", method = RequestMethod.GET)
	public @ResponseBody List<Weatheruser> weatherListRestByWeatheruser(@PathVariable("id") Long weatheruserid) {
		return repository.findByWeatheruserId(weatheruserid);
	}
	
}
