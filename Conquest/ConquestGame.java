package Conquest;

import Game.GameWriteable;

public class ConquestGame implements GameWriteable {


    @Override
    public boolean isHighScore(String score, String currentHighScore) {
        return false;
    }

    @Override
    public String getGameName() {
        return "Conquest";
    }

    @Override
    public void play() {

    }

    @Override
    public String getScore() {
        return "";
    }


}
