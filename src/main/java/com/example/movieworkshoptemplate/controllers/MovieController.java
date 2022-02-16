package com.example.movieworkshoptemplate.controllers;

import com.example.movieworkshoptemplate.models.Movie;
import com.example.movieworkshoptemplate.repositories.MovieDataRepository;
import com.example.movieworkshoptemplate.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MovieController {


    //Controller methods
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/getFirst")
    public String getFirst(){
       return MovieService.getFistMovie();
    }

    @GetMapping("/getRandom")
        public String getRandom(){
return MovieService.getRandom();
        }

        @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity(){
        return MovieService.getTenSortByPopularity();
    }
    @GetMapping("/howManyWonAnAward")
    public String howManyWonAnAward(){
        return MovieService.howManyWonAnAward();
    }
    }

