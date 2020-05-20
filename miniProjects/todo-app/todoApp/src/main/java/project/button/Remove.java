package project.button;

import project.button.ButtonTypes;
import project.button.ButtonSize; 

public class Remove implements Button {
  
  public String type = ButtonTypes.REMOVE.toString();
  public ButtonSize size = ButtonSize.SMALL;

  public String render(){
    String rendering =  "--" + this.type.toString() + "--";
    System.out.println("--" + this.type.toString() + "--");
    return rendering;
  }

  public String onClick() {
    String clicked = "Task was " + this.type.toString()+"D";
    System.out.println("Task was " + this.type.toString() +"D");
    return clicked;
  }
}