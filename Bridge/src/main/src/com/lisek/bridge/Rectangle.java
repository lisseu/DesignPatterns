package com.lisek.bridge;

public class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    void drawShapes(int border) {
        System.out.print("Drawing rectangle ");
        color.fillWithColor(border);
    }

    void modifyBorder(int border, int increment) {
        System.out.println("changing the border width by " + increment);
        border = border + increment;
        drawShapes(border);
    }
}
