package com.company.task10;

public class MainShapeCircleRectangle {
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Circle("зеленый", 36, 36);
        shape[1] = new Rectangle("красный", 36, 36, 89, 89);
        for (Shape sh : shape) {
            sh.draw();
        }
    }
}
