/**
 * 
 */
package fi.hh.SWD4TN022.saapaivakirja.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author
 *
 */
public interface WeatherRepository extends CrudRepository<Weather, Long>{
	
	List<Weather> findByQuestionid(Long questionid);
	
}
