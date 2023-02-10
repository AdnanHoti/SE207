
public class Circle extends Shape {
	private double radius;

  public Circle(double radius) {
	  this.radius = radius;
  }

  @Override
  public String getDescription() {
	  return "Circle with radius " + radius;
  }

@Override
public void draw() {
	
}
}