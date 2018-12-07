package fi.hh.SWD4TN022.saapaivakirja.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface WeatheruserRepository extends CrudRepository <Weatheruser, Long> {
	
	List<Weatheruser>findByWatherusername(String name);
	
	List<Weatheruser>findByWeatheruserId(Long id);

}
