package com.company.sdajava.observer_exercise;

/**
 * Created by RENT on 2017-04-10.
 */
public class Telewizja implements Obserwator, Media {
    public Integer [] wyniki;
    public Totolotek lotek;

    public Telewizja(Integer[] wyniki, Totolotek lotek) {
        this.wyniki = wyniki;
        this.lotek = lotek;
    }

    public Telewizja(Totolotek lotek) {
        this.lotek = lotek;
    }

    public void update (Integer [] wyniki){
        lotek.kolejneLosowanie();

    }

    public void informuj (){
        lotek.getResults();

    }

    public void spadam (){

    }


}
