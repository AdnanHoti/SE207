public class ShadeDecorator extends ShapeDecorator {
	private String shade;

public ShadeDecorator(Shape shape, String shade) {
	super(shape);
    this.shade = shade;
  }

  @Override
public String getDescription() {
	  return shape.getDescription() + " with shade " + shade;
  }

@Override
public void draw() {
	
}
}