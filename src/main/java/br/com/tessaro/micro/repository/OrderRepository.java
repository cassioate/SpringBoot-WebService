package br.com.tessaro.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.micro.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
