package br.com.tessaro.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.micro.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
