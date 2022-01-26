package day43;


public class ShapesArray {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Shape();
        shapes[1] = new Circle();
        shapes[2] = new Square();
        shapes[3] = new Triangle();

        for (Shape s : shapes) {
           //s.draw();
            System.out.println(s.getClass().getName());
        }

    }
}
