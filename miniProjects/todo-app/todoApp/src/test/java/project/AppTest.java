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
        String expected = "John Doe"; 
        String actual = todo.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void todoHasTask() {
        String expected = "Clean Room";
        String actual = todo.getTask();
        assertEquals(expected, actual);
    }
    
    @Test
    public void todoHasRemoveButton() {
        String expected = "REMOVE";
        String actual = todo.createButton().getType().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void renderTodoDetailsAndButton() {
        String expected = "Name: John Doe\n" + "Task: Clean Room\n" + "--" + "REMOVE" + "--";
        todo.createButton();
        String actual = todo.renderDetailsAndButton();
        assertEquals(expected, actual);
    }

    // ---------***Button Test Cases**-----------\\
    @Test
    public void renderRemoveButton() {
        String expected = "--" + "REMOVE" + "--"; 
        String actual = remove.render();
        assertEquals(expected, actual);
    }

    @Test
    public void clickRemoveButton() {
        String expected = "Task was REMOVED";
        String actual = remove.onClick();
        assertEquals(expected, actual);
    }

    @Test 
    public void checkRemoveButtonIsSmall() {
        String expected = "SMALL";
        String actual = remove.getSize().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void checkRemoveButtonHasType() {
        String expected = "REMOVE";
        String actual = remove.getType().toString();
        assertEquals(expected, actual);
    }
}
