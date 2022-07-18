package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.message.ResponseMessage;
import com.example.demo.services.KeycloakService;
import com.exemple.demo.model.User;


@RestController
public class Controller {
	
    @Autowired
    private KeycloakService keycloakService;

	
	@GetMapping(path = "/index")
	public String index() {
	    return "external";
	}
	
	@GetMapping(path = "/index2")
	public String index2() {
	    return "external";
	}
	
	@GetMapping(path = "/index/index3")
	public String index3() {
	    return "external";
	}
	
	 @PostMapping("/create")
	    public ResponseEntity<ResponseMessage> create(@RequestBody User user){
	        Object[] obj = keycloakService.createUser(user);
	        int status = (int) obj[0];
	        ResponseMessage message = (ResponseMessage) obj[1];
	        return ResponseEntity.status(status).body(message);
	    }
	 
		@GetMapping(path = "/crt")
		public String index5() {
		    return "external";
		}

}
