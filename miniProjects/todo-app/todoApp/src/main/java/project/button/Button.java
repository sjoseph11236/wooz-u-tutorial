package project.button; 

public interface Button {
  String render();
  String onClick();
  ButtonSize getSize();
  ButtonTypes getType();
}