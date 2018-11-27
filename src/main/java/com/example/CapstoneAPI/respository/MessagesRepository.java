package com.example.CapstoneAPI.respository;

import com.example.CapstoneAPI.domain.Messages;
import org.springframework.data.repository.CrudRepository;

public interface MessagesRepository extends CrudRepository<Messages, Integer> {
}
