public abstract class ShapeDecorator extends Shape {
	protected Shape shape;

 public ShapeDecorator(Shape shape) {
	 this.shape = shape;
  }

  @Override
  public abstract String getDescription();

}