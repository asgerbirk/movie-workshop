package com.example.movieworkshoptemplate.services;

import com.example.movieworkshoptemplate.controllers.MovieController;
import com.example.movieworkshoptemplate.models.Movie;
import com.example.movieworkshoptemplate.repositories.MovieDataRepository;

import java.security.PublicKey;
import java.util.*;

public class MovieService {
    //Services called from controllers that returns what the client requests



public static String getFistMovie(){
    ArrayList<Movie> allMovies = MovieDataRepository.movieList();
    String firstMovieTitle = allMovies.get(1).getTitle();
    return firstMovieTitle;
}


public static String getRandom(){
    ArrayList<Movie> allMovies = MovieDataRepository.movieList();
    Random r = new Random();
int random = r.nextInt(allMovies.size());

return allMovies.get(random).getTitle();
}
public static Movie getRandomMovie(){
ArrayList<Movie> allMovies = MovieDataRepository.movieList();
Random r = new Random();
int randomMovie = r.nextInt(allMovies.size());
return allMovies.get(randomMovie);
}

public static String getTenSortByPopularity(){
ArrayList<Movie> allMovies = MovieDataRepository.movieList();
  ArrayList<Movie> mostPopularMovies = new ArrayList<Movie>();

    for (int i = 0; i < 10; i++) {
      Movie randomMovieFromList = getRandomMovie();
      mostPopularMovies.add(randomMovieFromList);
    }
 Collections.sort(mostPopularMovies);

String returnList =  "<h1> ten movies sort</h1>";
    for ( Movie currentMovie: mostPopularMovies ) {

returnList +=  "<b> title <b>" + currentMovie.getTitle()+"<br>";
returnList += "<b> popularity<b>"+currentMovie.getPopularity()+"<br>";


    }
    return returnList;
 }


 public static String howManyWonAnAward(){
ArrayList<Movie> allMovies = MovieDataRepository.movieList();

int awardWinner = 0;
     for ( Movie awardWinningMovie:allMovies ) {
if (awardWinningMovie.isAwardWinning()){
    awardWinner++;
}
     }
return "<h1> antallet af film med pris </h2>" + allMovies.size() + awardWinner;
 }

}
