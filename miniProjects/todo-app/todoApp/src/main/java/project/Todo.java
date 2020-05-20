package project;

public class Todo {

  private String name; 
  private String task; 
  // private Button remove;
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
}