package br.com.tessaro.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.micro.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
