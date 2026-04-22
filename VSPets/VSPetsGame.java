package VSPets;
import Game.GameWriteable;

public class VSPetsGame implements GameWriteable {

    @Override
    public boolean isHighScore(String score, String currentHighScore) {
        return false;
    }

    @Override
    public String getGameName() {
        return "VSPets";
    }

    @Override
    public void play() {

    }

    @Override
    public String getScore() {
        return "";
    }

}
