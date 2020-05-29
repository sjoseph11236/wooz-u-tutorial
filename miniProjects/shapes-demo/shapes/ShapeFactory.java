package shapes; 


public class ShapeFactory {

  public Shape getShape(ShapeOptions shapeType) {
    
    if(ShapeOptions.CIRCLE == shapeType) {
      return new Circle();
    }
    else if(ShapeOptions.RECTANGLE== shapeType) {
      return new Rectangle();
    }
    else if(ShapeOptions.SQUARE == shapeType) {
      return new Square();
    }
    else {
      return null;
    }
  }
}