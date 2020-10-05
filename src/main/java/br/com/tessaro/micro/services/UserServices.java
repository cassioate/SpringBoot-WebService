package br.com.tessaro.micro.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.tessaro.micro.entities.User;
import br.com.tessaro.micro.repository.UserRepository;
import br.com.tessaro.micro.services.exceptions.DataBaseException;
import br.com.tessaro.micro.services.exceptions.ResourceNotFoundExcepetion;

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
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));
	}
	
	//Post
	public User insert (User objeto) {
		return repository.save(objeto);
	}
	
	//PUT
	public User update (User obj, Long id) {
		try {
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundExcepetion(id);
		}
	}
	
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setPhone(obj.getPhone());
		entity.setEmail(obj.getEmail());
		entity.setPassword(obj.getPassword());
	}
	
	//Delete
	public void delete () {
		repository.deleteAll();
	}
	
	//DeleteID
	public void deleteId(Long id) {
		try {
		repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundExcepetion(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}
	}
	
}
