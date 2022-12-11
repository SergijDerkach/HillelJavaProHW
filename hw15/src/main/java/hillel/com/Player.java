package hillel.com;

public class Player {
    private String name;
    private int numOfGame = 0;
    private int numOfWinGame = 0;
    private int numOfLosGame = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfGame() {
        return numOfGame;
    }

    public void setNumOfGame(int num) {
        this.numOfGame = num;
    }

    public int getNumOfWinGame() {
        return numOfWinGame;
    }

    public void setNumOfWinGame(int num) {
        this.numOfWinGame = num+1;
    }

    public int getNumOfLosGame() {
        return numOfLosGame;
    }

    public void setNumOfLosGame(int num) {
        this.numOfLosGame = num+1;
    }
}
