package project;

import project.button.*;

public class Todo extends Container{

  private String name; 
  private String task; 
  private Button remove;

  public Todo(String name, String task) {
    this.name = name; 
    this.task = task;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTask() {
    return this.task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public Button createButton() {
    this.remove = new Remove();
    return this.remove;
  }

  public String renderDetailsAndButton() {
    return "Name: " + this.name + "\n" + "Task: " + this.task + "\n" + this.remove.render();
  }
}