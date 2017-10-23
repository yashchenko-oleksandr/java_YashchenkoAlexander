package com.company.task10;

public class Circle extends Shape {
    private int x, y;

    public Circle(int x, int y) {
        this.x = 21;
        this.y = 21;
    }

    public Circle(String colour, int x, int y) {
        super(colour);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw() {
        System.out.println("Рисую крус с цветом " + getColour() + ", Координатами " + x + "-" + y);
    }
}
