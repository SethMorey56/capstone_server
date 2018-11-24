package com.example.CapstoneAPI.respository;

import com.example.CapstoneAPI.domain.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Integer> {
}
