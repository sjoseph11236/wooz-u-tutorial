import shapes.*;

class Main {
  public static void main(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();

    Shape selectedShape = shapeFactory.getShape(ShapeOptions.CIRCLE);
    System.out.println(ShapeOptions.valueOf("RHOMBUS"));
    selectedShape.draw();
  }
}


// ENUM 
// COUPLING
// OVERRIDING
