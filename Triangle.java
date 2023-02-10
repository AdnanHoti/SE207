public class Triangle extends Shape {
	private double base;
	private double height;

 public Triangle(double base, double height) {
	 this.base = base;
	 this.height = height;
  }

  @Override
 public String getDescription() {
	  return "Triangle with base " + base + " and height " + height;
  }

@Override
public void draw() {
	
}
}
