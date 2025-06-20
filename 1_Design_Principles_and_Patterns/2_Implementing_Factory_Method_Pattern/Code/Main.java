interface Shape {
    void name();
}

class Circle implements Shape {
    public void name() {
        System.out.println("The Shape is circle");
    }
}

class Square implements Shape {
    public void name() {
        System.out.println("The Shape is Square");
    }
}

class Triangle implements Shape {
    public void name() {
        System.out.println("The Shape is Triangle");
    }
}

class ShapeFactory {
    public ShapeFactory() {}

    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if(shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        if(shape.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
            
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("Circle");
        if(shape1 == null) {
            System.out.println("Shape not Found");
            return;
        }
        shape1.name();

        Shape shape2 = factory.getShape("Square");
        if (shape2 == null) {
            System.out.println("Shape not Found");
            return;
        }
        shape2.name();

        Shape shape3 = factory.getShape("Hexagon");
        if (shape3 == null) {
            System.out.println("Shape not Found");
            return;
        }
        shape3.name();
    }
}