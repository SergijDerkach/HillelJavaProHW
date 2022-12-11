package Service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerServiceImpTest {

    @Test
    public void retNumb() {
        PlayerServiceImp ser = new PlayerServiceImp();
        String s = "P";
        int rez = ser.retNumb(s);

        Assert.assertEquals(1,rez);
    }

}