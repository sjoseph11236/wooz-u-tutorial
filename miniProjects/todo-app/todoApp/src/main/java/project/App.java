package project;

/**
 * Hello world!
 *
 */
public class App 
{  static public Container todo;
    public static void main( String[] args ){
        todo = new Todo("John Doe", "Clean Room");
        addTodo();
        // todo.createButton();
        System.out.println(todo.renderDetailsAndButton());
        // System.out.println( "Name: John Doe\n" + "Task: Clean Room\n" + "--" + "REMOVE" + "--");
    }

    public static void addTodo() {
        todo.renderTodo();
    }
}

