package inheritance_lab;

import java.util.Scanner;

class Circle {
    double radius;
    double x;
    double y;

    Circle(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    double computeArea() {
        return Math.PI * radius * radius;
    }

    double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    boolean isPointInside(double px, double py) {
        double dx = px - x;
        double dy = py - y;
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance <= radius;
    }
}

public class circle_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
        	System.out.println("===================Enter Circle Input=================");
            System.out.print("\nEnter the radius of the circle ");
            double radius = sc.nextDouble();
            if (radius < 0) {
            	System.out.println("You Enter Negative radius");
            	System.out.println();
                break;
            }

            System.out.print("Enter the x coordinate of the center: ");
            double x = sc.nextDouble();
            System.out.print("Enter the y coordinate of the center: ");
            double y = sc.nextDouble();
            System.out.print("Enter the x coordinate of the point to check: ");
            double px = sc.nextDouble();
            System.out.print("Enter the y coordinate of the point to check: ");
            double py = sc.nextDouble();

            Circle circle = new Circle(radius, x, y);

            System.out.println("\n================Circle Result====================");
            System.out.println("\nArea of the circle: " + circle.computeArea());
            System.out.println("Perimeter of the circle: " + circle.computePerimeter());


            if (circle.isPointInside(px, py)) {
                System.out.println("The point is inside the circle.");
            } else {
                System.out.println("The point is outside the circle.");
            }

            System.out.println();
        }

       
    }
}