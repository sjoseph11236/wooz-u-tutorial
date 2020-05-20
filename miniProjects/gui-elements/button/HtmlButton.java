package button;

public class HtmlButton implements Button {

  public void render() {
    System.out.println("----Test Button----");
    onClick();
  }

  public void onClick() {
    System.out.println("Click! Buttons - 'Hello World!'");
  }
}