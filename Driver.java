public class Driver {
  public static void main(String[] args) {
    // Create a Circle with no decorators
    Circle circle = new Circle(10);
    System.out.println("Circle: " + circle.getDescription());

    // Create a Rectangle with 1 decorator
    Rectangle rectangle = new Rectangle(10, 20);
    BorderDecorator borderDecorator = new BorderDecorator(rectangle, 5);
    System.out.println("Rectangle: " + borderDecorator.getDescription());

    // Create a Triangle with 2 decorators
    Triangle triangle = new Triangle(10, 20);
    ColorDecorator colorDecorator = new ColorDecorator(triangle, "red");
    ShadeDecorator shadeDecorator = new ShadeDecorator(colorDecorator, "dark");
    System.out.println("Triangle: " + shadeDecorator.getDescription());

    // Create a Circle with 3 decorators
    Circle circle2 = new Circle(15);
    BorderDecorator borderDecorator2 = new BorderDecorator(circle2, 7);
    ColorDecorator colorDecorator2 = new ColorDecorator(borderDecorator2, "blue");
    ShadeDecorator shadeDecorator2 = new ShadeDecorator(colorDecorator2, "light");
    System.out.println("Circle: " + shadeDecorator2.getDescription());
  }
}
