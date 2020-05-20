import factory.*;

public class Demo { 

  private  static Dialog dialog;

  public static void main(String[] args) {
    configure("Windows 10");
    runBusinessLogic();
  }

  // I think this is factory method
  static void configure(String systemType) {
    if(systemType == "Windows 10" ) {
      dialog = new WindowsDialog();
    }
    else {
      dialog = new HtmlDialog();
    }
  }

  static void runBusinessLogic() {
    dialog.renderWindow();
  }
}