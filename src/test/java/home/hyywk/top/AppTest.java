package home.hyywk.top;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.io.FileInputStream;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public void test1() {
        try {
            FileInputStream fileInputStream = new FileInputStream( "/home/wangkai/aa.txt" );
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
