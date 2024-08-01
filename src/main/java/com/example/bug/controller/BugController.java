package com.example.bug.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.http.ResponseEntity;
import com.example.bug.common.ResponseModel;
import org.springframework.http.MediaType;
import com.example.bug.repository.PostRepository;
import com.example.bug.model.Bug;
import java.util.List;
//import com.example.bug.repository.ISearchRepository;


@RestController
@RequestMapping("v1/api/")
public class BugController {

    @Autowired
    PostRepository repo;

    // @Autowired
    // IBugService service;
    
   
    

        @GetMapping("/bugs")
        public List<Bug> getAllBugs(){
            return repo.findAll();
        }
        

        @DeleteMapping("/bugs/{id}")
        public void deleteBug(@PathVariable String id){
            repo.deleteById(id);
        }

        @PostMapping("/bugs")
        public Bug addPost(@RequestBody Bug bug){
            return repo.save(bug);
        }

        // @PostMapping("/{id}/assign")
        // public Bug assignBug(@PathVariable String id, @RequestBody String userId){

        //     return service.updateBug(id,userId);
        // }

        // @PutMapping("/bugs/{id}")
        // public Bug updateBug(@PathVariable String id @RequestBody Bug bug){
        //     return 
        // }

        // @GetMapping("/bugs/{id}")
        // public Bug getBugs(@PathVariable String id){
        //     Bug b=  repo.findById(id);
        //     return b;
        // }

        // @GetMapping("/bugs/{text}")
        // public List<Bug> search(@PathVariable String text){
        //     return srepo.findByText(text);
        // }
    
}
