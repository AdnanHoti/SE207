public class ColorDecorator extends ShapeDecorator {
	private String color;

 public ColorDecorator(Shape shape, String color) {
	 super(shape);
     this.color = color;
  }

  @Override
 public String getDescription() {
	  return shape.getDescription() + " in color " + color;
  }

@Override
public void draw() {
	
}
}
