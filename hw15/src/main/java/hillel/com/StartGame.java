package hillel.com;

import java.io.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.imp.ComputerServImp;
import service.imp.MatrixServImp;
import service.imp.PlayerServiceImp;
import service.imp.StartGameImp;

import java.util.Scanner;

public class StartGame {
    private static final Logger logger = LoggerFactory.getLogger("stdout");
    private static final Logger save = LoggerFactory.getLogger("logger");
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

        logger.info("Start game!");
        save.info("Start game!");
        //-----
        String question1 = "Enter your name ...";
        logger.info(question1);
        save.info(question1);

        String name = scan.nextLine();
        save.info(name);

        //-----
        String question2 = "Enter number of games ...";
        logger.info(question2);
        save.info(question2);

        int numberOfGames = scan.nextInt();
        save.info(String.valueOf(numberOfGames));
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
            logger.info(question3);
            save.info(question3);

            String plInputVal = scan.nextLine();
            save.info(plInputVal);
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
                logger.info(question4);
                save.info(question4);

                cont = scan.nextLine();
                save.info(cont);
            }

        }while (cont.toLowerCase().equals("y"));

        if(!cont.equals("y")){
            countGame = playingGame;
        }else countGame = player.getNumOfGame();

        String resGamePl = "Count game: "+countGame+", "+
                player.getName() +" wins: " + player.getNumOfWinGame() + ", "
                +player.getName() +" lose: " + player.getNumOfLosGame();

        logger.info(resGamePl);
        save.info(resGamePl);
        save.info("------- End game -------");

    }
}
