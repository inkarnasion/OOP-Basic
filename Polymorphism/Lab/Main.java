package Polymorohism.Shape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main
    (String[]args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Circle circle = new Circle(5.5);
        Rectangle rectangle = new Rectangle(5.0, 6.0);

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);

        shapes.forEach(shape -> {
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        });
    }
}