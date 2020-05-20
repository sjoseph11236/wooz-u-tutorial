package project;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

// Need to import button folder
import project.button.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    public Todo todo;
    public Button remove; 
    
    @Before
    public void initializeTodo() {
        todo = new Todo("John Doe", "Clean Room");
        remove = new Remove();
    }

    @Test
    public void todoHasName(){
        String expected = todo.getName();
        String actual = "John Doe";
        assertEquals(expected, actual);
    }

    @Test
    public void todoHasTask() {
        String expected = todo.getTask();
        String actual = "Clean Room";
        assertEquals(expected, actual);
    }
    
    // @Test
    // public void todoHasRemoveButton() {
    //     String expected = todo.button.type;
    //     String actual = "REMOVE";
    //     assertEquals(expected, actual);
    // }

    // Button Test Cases
    @Test
    public void renderButton() {
        String expected = remove.render();
        String actual =  "--" + "REMOVE" + "--";
        assertEquals(expected, actual);
    }
    
    
}
