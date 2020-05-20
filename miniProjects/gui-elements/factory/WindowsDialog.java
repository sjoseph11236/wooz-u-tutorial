package factory;

import button.*;
import button.WindowsButton;

public class WindowsDialog extends Dialog {
  
  public Button createButton() {
    return new WindowsButton();
  }
}