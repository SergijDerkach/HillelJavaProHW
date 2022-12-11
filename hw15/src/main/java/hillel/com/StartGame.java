package hillel.com;

import Service.ComputerServImp;
import Service.MatrixServImp;
import Service.PlayerServiceImp;

import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {
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

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name ...");
        String name = scan.nextLine();
        System.out.println("Enter number of games ...");
        int numberOfGames = scan.nextInt();
        int playingGame = 0;
        int countGame;
        String cont = "y";
        scan.nextLine();

        player.setName(name);
        player.setNumOfGame(numberOfGames);

        do {
            numberOfGames--;
            playingGame++;
            System.out.println("Enter Rock(R)/Paper(P)/Scissors(S) ...");
            String plInputVal = scan.nextLine();

            int plNum = pl.retNumb(plInputVal.toUpperCase());
            int compNum = compServ.generateNumb();

            if(matServ.getValue(plNum, compNum,matrix).equals("d")){
                player.setNumOfLosGame(player.getNumOfLosGame());
            } else if ((matServ.getValue(plNum, compNum,matrix).equals("l"))){
                player.setNumOfLosGame(player.getNumOfLosGame());
            } else if ((matServ.getValue(plNum, compNum,matrix).equals("w"))){
                player.setNumOfWinGame(player.getNumOfWinGame());
            }

            if(numberOfGames == 0){
                cont = "n";
            }else {
                System.out.println("Continue game(Y/N) ...");
                cont = scan.nextLine();
            }

        }while (cont.toLowerCase().equals("y"));

        if(!cont.equals("y")){
          countGame = playingGame;
        }else countGame = player.getNumOfGame();

        System.out.println("Count game: "+countGame+", "+
                player.getName() +" wins: " + player.getNumOfWinGame() + ", "
                +player.getName() +" lose: " + player.getNumOfLosGame());
    }
}
