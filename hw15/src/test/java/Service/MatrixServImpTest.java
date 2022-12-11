package Service;

import org.junit.Assert;
import org.junit.Test;

public class MatrixServImpTest {

    @Test
    public void getValue() {
        String[][] m = {
                {"d","l","w"},
                {"l","d","w"},
                {"w","l","d"}
        };
        int pl = 0;
        int comp = 2;
        String rez = m[pl][comp];
        Assert.assertEquals("w",rez);
    }
}