package com.company.player;

public interface Player {
    void play(String movie);

    default void stop(){
        System.out.println("Stop playing!");
    }
}
