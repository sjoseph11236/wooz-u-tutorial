package factory;

import button.HtmlButton;
import button.*;

public class HtmlDialog extends Dialog { 

  public Button createButton() {
    return new HtmlButton();
  }
}