package Service;

import hillel.com.Player;

public class PlayerServiceImp implements PlayerService{

    @Override
    public Integer retNumb(String val) {
        switch (val){
            case "R":
                return 0;
            case "P":
                return 1;
            case "S":
                return 2;
            default:
                return 3;
        }
    }
}
