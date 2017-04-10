package com.company.sdajava.observer_exercise;


public class Main {

    public static void main(String[] args) {
        // write your code here

        Totolotek lotek = new Totolotek();

        Telewizja telewizja = new Telewizja (lotek);
        Internet internet = new Internet(lotek);


        lotek.kolejneLosowanie();
        lotek.usunObserwatora(telewizja);



    }
}

