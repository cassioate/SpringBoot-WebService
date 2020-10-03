package br.com.tessaro.micro.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tessaro.micro.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Cassio", "cassioate@gmail.com", "(83)9 9918-9488", "12345");
		
		return ResponseEntity.ok().body(u);
	}
	
}
