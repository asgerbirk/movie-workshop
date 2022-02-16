package com.example.movieworkshoptemplate.repositories;

import com.example.movieworkshoptemplate.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDataRepository {
    //Methods to get data from file

    public static ArrayList<Movie> movieList(){
        ArrayList<Movie> allMovies = new ArrayList<>();
        File imdbMovies = new File("resources/imdb-data.csv");

            try {
                Scanner sc = new Scanner(imdbMovies);
                sc.hasNextLine();
                while (sc.hasNext()){

                    String line = sc.nextLine();
                    String[] stringAsArray = line.split(";");

                    int year = Integer.parseInt(stringAsArray[0]);
                    int length = Integer.parseInt(stringAsArray[1]);
                    String title = stringAsArray[2];
                    String subject = stringAsArray[3];
                    int popularity = Integer.parseInt(stringAsArray[4]);
                    String awards = stringAsArray[5];

                    Movie currentMovie = new Movie(year,length,title,subject,popularity,awards);
                    allMovies.add(currentMovie);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("file not found");
            }
return allMovies;

        }
    }

