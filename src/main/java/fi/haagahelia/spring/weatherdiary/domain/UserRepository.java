package fi.haagahelia.spring.weatherdiary.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Anne
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> { 
    User findByUsername(String username);
}