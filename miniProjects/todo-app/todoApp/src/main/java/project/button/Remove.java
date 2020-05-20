package project.button;

import project.button.ButtonTypes;
import project.button.ButtonSize; 

public class Remove implements Button {
  
  private ButtonTypes type = ButtonTypes.REMOVE;
  private ButtonSize size = ButtonSize.SMALL;

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

  public ButtonSize getSize() {
    return this.size;
  }

  public ButtonTypes getType() {
    return this.type;
  }
}