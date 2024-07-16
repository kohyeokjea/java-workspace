package section12.practice.ex02;

interface Shape {
    double calculateArea();

    String getName();
}

class Cirlce implements Shape {
    double radius;
    String name;

    // Math.PI * radius * radius
    Cirlce(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    double width;
    double height;
    String name;

    // width * height
    Rectangle(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle implements Shape {
    double width;
    double height;
    String name;

    // width * height * 0.5
    Triangle(double width, double height, String name) {
        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculateArea() {
        return width * height * 0.5;
    }
}

public class Practice1202 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Cirlce(5.0, "원"),
                new Rectangle(4.0, 6.0, "직사각형"),
                new Triangle(4.0, 5.0, "삼각형")
        };

        for (Shape shape : shapes) {
            System.out.printf("%s의 면적: %.2f\n", shape.getName(), shape.calculateArea());
        }
    }
}
