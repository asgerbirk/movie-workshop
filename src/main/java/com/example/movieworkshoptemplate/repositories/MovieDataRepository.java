package com.example.movieworkshoptemplate.repositories;

import com.example.movieworkshoptemplate.models.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieDataRepository {
    //Methods to get data from file

    public static ArrayList<Movie> movieList() {
        ArrayList<Movie> allMovies = new ArrayList<Movie>();
        File imdbMovies = new File("resources/imdb-data.csv");

        try {
            Scanner sc = new Scanner(imdbMovies);
            sc.nextLine();
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] lineSplit = line.split(";");
                Movie movie = createMovie(lineSplit);
                allMovies.add(movie);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("file not found");
        }
        return allMovies;

    }

    public static Movie createMovie(String[] info) {


        int year = Integer.parseInt(info[0]);
        int length = Integer.parseInt(info[1]);
        String title = info[2];
        String subject = info[3];
        int popularity = Integer.parseInt(info[4]);
        String awards = info[5];
        return new Movie(year, length, title, subject, popularity, awards);
    }
}
