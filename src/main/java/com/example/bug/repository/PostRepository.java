package com.example.bug.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.bug.model.Bug;
import java.util.List;


public interface PostRepository extends MongoRepository<Bug, String> {
    List <Bug> findByStatus(String status);

    List <Bug> findByPriority(String priority);

    List <Bug> findByAssignedTo(String userId);
}
