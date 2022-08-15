package springboot.springapp.productcatalogws.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import springboot.springapp.productcatalogws.ProductCatalogWsApplication;
import springboot.springapp.productcatalogws.model.User;
import springboot.springapp.productcatalogws.repository.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    Logger logger = LoggerFactory.getLogger(ProductCatalogWsApplication.class);
    @Autowired
    UserRepository userRepository;
    public ResponseEntity<User> getUserById(Integer id) {
        try{
            Optional<User> user = userRepository.findById(id);
            if (!user.isPresent()) throw new Exception();
            logger.info("User found with id {}",id);
            return ResponseEntity.status(HttpStatus.OK).body(user.get());
        }catch (Exception ex){
            logger.error("Error to found User with ID {}",id);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new User());
        }
    }

}
