package br.com.tessaro.micro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tessaro.micro.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
