package com.example.movieworkshoptemplate.models;

//Movie POJO
public class Movie implements Comparable<Movie>{



    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private boolean isAwardWinning;

    public Movie(int year, int length, String title, String subject, int popularity, String isAwardWinning) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.isAwardWinning = isAwardWinning.equals("yes");
    }


    public boolean isAwardWinning() {
        return isAwardWinning;
    }

    public void setAwardWinning(boolean awardWinning) {
        isAwardWinning = awardWinning;
    }

    public String getTitle() {
        return title;
    }



    public int getPopularity() {
        return popularity;
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
