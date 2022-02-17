package com.example.movieworkshoptemplate.repositories;

import com.example.movieworkshoptemplate.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDataRepository {
    //Methods to get data from file

    public static ArrayList<Movie> movieList(){
        ArrayList<Movie> allMovies = new ArrayList<Movie>();
        File imdbMovies = new File("resources/imdb-data.csv");

            try {
                Scanner sc = new Scanner(imdbMovies);
                sc.hasNextLine();
                while (sc.hasNext()){

                    String line = sc.nextLine();
                    String[] lineSplit = line.split(";");
                 Movie movie = Movie.createMovie(lineSplit);
                 allMovies.add(movie);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("file not found");
            }
return allMovies;

        }


    }

