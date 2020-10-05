package br.com.tessaro.micro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.micro.entities.User;
import br.com.tessaro.micro.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository repository;
	
	//GETALL
	public List<User> findAll(){
		return repository.findAll();
	}
	//GETID
	public User findById (Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	//Post
	public User insert (User objeto) {
		return repository.save(objeto);
	}
	
	//PUT
	public User update (User user, Long id) {
		repository.deleteById(id);
		return repository.save(user);
	}
	
	//Delete
	public void delete () {
		repository.deleteAll();
	}
	
	//DeleteID
	public void deleteId(Long id) {
		repository.deleteById(id);
	}
	
}
