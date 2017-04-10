package com.company.sdajava.observer_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-04-10.
 */
public class Totolotek implements Obserwowany{

    List<Obserwator> obserwatorzy = new ArrayList<Obserwator>();
    public Integer [] wyniki;

    public Integer[] getWyniki() {
        return wyniki;
    }

    public void setWyniki(Integer[] wyniki) {
        this.wyniki = wyniki;
        kolejneLosowanie();

    }

    public void dodajObserwatora (Obserwator o){
        obserwatorzy.add(o);
    }

    public void usunObserwatora (Obserwator o){
        obserwatorzy.remove(o);

    }

    public void powiadamiajObserwatorów () {
        Obserwator.update(getWyniki());


    }


    public void kolejneLosowanie (){

        obserwatorzy.forEach(o -> o.update(getResults()));
        powiadamiajObserwatorów();

    }

    public void getResults (){
        Random random = new Random(6);
        wyniki.equals(random.nextInt());
        System.out.println(wyniki);

    }


}
