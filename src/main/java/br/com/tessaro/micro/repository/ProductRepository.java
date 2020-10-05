package br.com.tessaro.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.micro.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
