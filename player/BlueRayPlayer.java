package com.company.player;

public class BlueRayPlayer implements Player, HDRPlayer{
    @Override
    public void play(String movie) {
        System.out.println("Play BlueRay " + movie );
    }

    @Override
    public boolean canPlayHdr() {
        return true;
    }
}
