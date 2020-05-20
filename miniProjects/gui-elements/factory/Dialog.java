package factory;

import button.*;

public abstract class Dialog {
  
  public void renderWindow(){

    Button okButton = createButton();
    okButton.render();
  }
  // The docs say this is the factory method
  public abstract Button createButton();
}