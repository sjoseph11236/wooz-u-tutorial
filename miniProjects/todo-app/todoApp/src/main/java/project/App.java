package project;

import java.util.Scanner;

public class App 
{  static public Container todo;
    public static void main( String[] args ){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please add name of person to complete task: ");

        String name = userInput.nextLine();
        
        System.out.println("Please add task for " + name + "to complete: ");

        String task = userInput.nextLine();

        System.out.println("Do you want " + name + " to complete " + task);


        todo = new Todo(name, task);
        
        addTodo();

        System.out.println(todo.renderDetailsAndButton());

        // // System.out.println( "Name: John Doe\n" + "Task: Clean Room\n" + "--" + "REMOVE" + "--");
    }

    public static void addTodo() {
        todo.renderTodo();
    }
}

