package cgg.annotations.annotationexample.service;

import org.springframework.stereotype.Service;

@Service
public class VoteService {
    
    public void vote(int age){
        System.out.println("voted");
        //database logic
    }
}
