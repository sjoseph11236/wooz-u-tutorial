import shapes.*;

class Main {

  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape myCircle = shapeFactory.getShape("CIRCLE");

    myCircle.draw();
  }
}