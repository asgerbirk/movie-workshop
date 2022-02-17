package com.example.movieworkshoptemplate.models;

//Movie POJO
public class Movie implements Comparable<Movie>{



    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private String awards;


    public Movie(int year, int length, String title, String subject, int popularity,String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }

    public static Movie createMovie(String[] info){
        int year = Integer.parseInt(info[0]);
        int length = Integer.parseInt(info[1]);
        String title = info[2];
        String subject = info[3];
        int popularity = Integer.parseInt(info[4]);
        String awards = info[5];

        return new Movie(year,length,title,subject,popularity,awards);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }



    @Override
    public int compareTo(Movie o) {
        if (this.popularity>(o.getPopularity())){
            return 1;
        }else if (this.popularity<(o.getPopularity())){
            return -1;
        }else
        return 0;
    }


}
