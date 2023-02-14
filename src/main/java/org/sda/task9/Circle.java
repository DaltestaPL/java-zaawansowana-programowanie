package org.sda.task9;


import org.sda.task10.Movable;
import org.sda.task10.MoveDirection;
import org.sda.task11.Resizable;

public class Circle implements Movable, Resizable {

    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;

    }

    public Point2D getCenter() {
        return center;
    }

    public void setCenter(Point2D center) {
        this.center = center;
    }

    public Point2D getPoint() {
        return point;
    }

    public void setPoint(Point2D point) {
        this.point = point;
    }

    double getRadius() {
        // //|AB|=√(x2−x1)^2+(y2−y1)^2
        double part1 = Math.pow(point.getX() - center.getX(), 2);
        double part2 = Math.pow(point.getY() - center.getY(), 2);
        return Math.sqrt(part1 + part2);

    }

    //obwód okręgu
    double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", point=" + point +
                '}';
    }

    @Override
    public void resize(double resizeFactor) {
        var radius = getRadius() * resizeFactor;
        this.point = new Point2D(this.point.getX() + radius, this.point.getY() + radius);
    }
}