package hillel.com;

import java.io.*;
import service.imp.ComputerServImp;
import service.imp.MatrixServImp;
import service.imp.PlayerServiceImp;
import service.imp.StartGameImp;

import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) throws IOException {
        String [][] matrix = {
                {"d","l","w"},
                {"l","d","w"},
                {"w","l","d"}
        };

        MatrixServImp matServ = new MatrixServImp();

        Player player = new Player();
        PlayerServiceImp pl = new PlayerServiceImp();

        Computer comp = new Computer();
        ComputerServImp compServ = new ComputerServImp();
        StartGameImp sGame = new StartGameImp();
        Scanner scan = new Scanner(System.in);

        sGame.writingToFile("Start game!");
        //-----
        String question1 = "Enter your name ...";
        System.out.println(question1);
        sGame.writingToFile(question1);
        String name = scan.nextLine();
        sGame.writingToFile(name);
        //-----
        String question2 = "Enter number of games ...";
        System.out.println(question2);
        sGame.writingToFile(question2);
        int numberOfGames = scan.nextInt();
        sGame.writingToFile(String.valueOf(numberOfGames));
        //-----
        int playingGame = 0;
        int countGame;
        String cont = "y";
        scan.nextLine();

        player.setName(name);
        player.setNumOfGame(numberOfGames);

        do {
            numberOfGames--;
            playingGame++;
            String question3 ="Enter Rock(R)/Paper(P)/Scissors(S) ...";
            System.out.println(question3);
            sGame.writingToFile(question3);
            String plInputVal = scan.nextLine();
            sGame.writingToFile(plInputVal);
            //-----
            int plNum = pl.retNumb(plInputVal.toUpperCase());
            int compNum = compServ.generateNumb();

            //----
            String valueG = matServ.getValue(plNum, compNum,matrix);

            if(valueG.equals("d")){
                player.setNumOfLosGame(player.getNumOfLosGame());
            } else if ((valueG.equals("l"))){
                player.setNumOfLosGame(player.getNumOfLosGame());
            } else if ((valueG.equals("w"))){
                player.setNumOfWinGame(player.getNumOfWinGame());
            }

            if(numberOfGames == 0){
                cont = "n";
            }else {
                String question4 ="Continue game(Y/N) ...";
                System.out.println(question4);
                sGame.writingToFile(question4);

                cont = scan.nextLine();
                sGame.writingToFile(cont);
            }

        }while (cont.toLowerCase().equals("y"));

        if(!cont.equals("y")){
            countGame = playingGame;
        }else countGame = player.getNumOfGame();

        String resGamePl = "Count game: "+countGame+", "+
                player.getName() +" wins: " + player.getNumOfWinGame() + ", "
                +player.getName() +" lose: " + player.getNumOfLosGame();

        System.out.println(resGamePl);
        sGame.writingToFile(resGamePl);
        sGame.writingToFile("------- End game -------");
    }
}
