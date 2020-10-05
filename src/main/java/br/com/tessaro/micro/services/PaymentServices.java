package br.com.tessaro.micro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tessaro.micro.entities.Payment;
import br.com.tessaro.micro.repository.PaymentRepository;

@Service
public class PaymentServices {

	@Autowired
	private PaymentRepository repository;
	
	public List<Payment> findAll(){
		return repository.findAll();
	}
	
	public Payment findById (Long id) {
		Optional<Payment> obj = repository.findById(id);
		return obj.get();
	}
	
}
