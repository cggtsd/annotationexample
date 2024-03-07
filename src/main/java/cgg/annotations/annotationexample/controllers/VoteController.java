package cgg.annotations.annotationexample.controllers;

import java.net.URI;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cgg.annotations.annotationexample.exceptions.AgeNotValidException;
import cgg.annotations.annotationexample.service.VoteService;

@RestController
@RequestMapping("/vote")
public class VoteController {
    
    private VoteService voteService;
    
    public VoteController(VoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping
    public ResponseEntity<?> vote(@RequestParam("age")int age){
        if(age<18){
            throw new AgeNotValidException("Age Not Valid ");
        }
         this.voteService.vote(age);
         return ResponseEntity.ok("Voted");
        
    }
}
