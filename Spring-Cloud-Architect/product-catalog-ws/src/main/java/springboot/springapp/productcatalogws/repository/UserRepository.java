package springboot.springapp.productcatalogws.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.springapp.productcatalogws.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
