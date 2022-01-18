package com.company.player;

public class CDPlayer implements Player{
    @Override
    public void play(String movie) {
        System.out.println("Play CD " + movie );
    }

}
