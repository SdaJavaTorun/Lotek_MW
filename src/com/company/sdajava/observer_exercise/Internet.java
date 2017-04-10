package com.company.sdajava.observer_exercise;

/**
 * Created by RENT on 2017-04-10.
 */
public class Internet implements Obserwator, Media  {
    public Integer [] wyniki;
    public Totolotek lotek;

    public Internet(Integer[] wyniki, Totolotek lotek) {
        this.wyniki = wyniki;
        this.lotek = lotek;
    }

    public Internet(Totolotek lotek) {
        this.lotek = lotek;
    }

    public void update (Integer [] wyniki){
        lotek.kolejneLosowanie();

    }

    public void informuj(){
        lotek.getResults();

    }

    public void spadam (){


    }
}
