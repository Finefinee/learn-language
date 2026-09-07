package amiddle.classs;

public class ClassElementEx1 {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);

        System.out.println("넓이: " + rectangle.calculateArea());
        System.out.println("둘레 길이: " + rectangle.calculatePerimeter());
        System.out.println("정사각형 여부: " + rectangle.isSquare());
    }
}

class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    int calculateArea() {
        return width * height;
    }

    int calculatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
