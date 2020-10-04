package br.com.tessaro.micro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.micro.entities.Order;
import br.com.tessaro.micro.repository.OrderRepository;

@Service
public class OrderServices {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById (Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
