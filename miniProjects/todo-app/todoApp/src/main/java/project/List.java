package project;

import project.button.*;
import java.util.*; 

public abstract class List {

  private ArrayList <Todo> todos; 

  public void renderTodo() {
    // Button remove = createButton();
  
    // System.out.println(remove.render());
  }

  public abstract Button createButton();
}