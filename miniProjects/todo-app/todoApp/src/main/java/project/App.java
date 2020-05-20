package project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Todo todo = new Todo("John Doe", "Clean Room");
        todo.createButton();
        System.out.println(todo.renderDetailsAndButton());
        // System.out.println( "Name: John Doe\n" + "Task: Clean Room\n" + "--" + "REMOVE" + "--");
    }

    // public static void addTodo(String name, String task) {
    //     List todos = new Todo();
    // }
}

