package springboot.springapp.productcatalogws.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.springapp.productcatalogws.model.User;
import springboot.springapp.productcatalogws.service.UserService;

@Log4j2
@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserCrudController {

    @Autowired
    UserService userService;

    @GetMapping
    ResponseEntity<String> helloUserService(){
        return ResponseEntity.ok("Hello User Service");
    }

    @GetMapping(path = "getUserById/{id}")
    ResponseEntity<User> getUserById(@PathVariable Integer id) {
        System.out.println("Starting getUserById Method from UserCrudController.class");
        return userService.getUserById(id);
    }

}
