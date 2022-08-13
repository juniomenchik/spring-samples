package springboot.springapp.productcatalogws.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloDockerController {

    @GetMapping
    ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello World!");
    }
}
