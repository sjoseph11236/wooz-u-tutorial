package project;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void todoHasName(){
        String expected = new Todo("John Doe", "Clean Room").getName();
        String actual = "John Doe";
        assertEquals(expected, actual);
    }
}
