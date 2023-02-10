public class BorderDecorator extends ShapeDecorator {
	private int borderWidth;

 public BorderDecorator(Shape shape, int borderWidth) {
	 super(shape);
     this.borderWidth = borderWidth;
  }

  @Override
 public String getDescription() {
	  return shape.getDescription() + " with border width " + borderWidth;
  }

@Override
public void draw() {
	
}
}
