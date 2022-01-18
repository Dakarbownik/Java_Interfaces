package com.company.player;

public class DVDPlayer implements Player{
    @Override
    public void play(String movie) {
        System.out.println("Play DVD " + movie );
    }

    @Override
    public void stop(){
        System.out.println("Odtwarzacz DVD zatrzymany");
    }
}
