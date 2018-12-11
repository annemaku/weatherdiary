/**
 * 
 */
package fi.haagahelia.spring.weatherdiary.domain;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author
 *
 */
@RepositoryRestResource
public interface WeatherRepository extends CrudRepository<Weather, Long>{
	
	Weather findByWeatherid(Long weatherid);

	Weather findByWeatherdate(Date weatherdate);
	
}
