package ar.edu.davinci.FirstSpringBoot.repository;

import ar.edu.davinci.FirstSpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

