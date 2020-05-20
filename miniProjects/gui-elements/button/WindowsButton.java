package button; 

public class WindowsButton implements Button {

  public void render() {
    System.out.println("Rendering on Screen for a click");
    onClick();
  }

  public void onClick() {
    System.out.println("Windows Button was clicked ");
  }
}