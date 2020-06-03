package shapes; 


public class ShapeFactory { 

  // take in input
  // instantiate based input.s
  public Shape getShape(String input) {
    
  // check if input is valid
    ShapeOptions selectedShape = ShapeOptions.valueOf(input);

    if(selectedShape == ShapeOptions.CIRCLE){
      return new Circle();
    }
    else if(selectedShape == ShapeOptions.RECTANGLE){
      return new Rectangle();
    }
    else if(selectedShape == ShapeOptions.SQUARE){
      return new Square();
    }
    else { 
      return null;
    }
  }
}