package pl.javastart.task;

import java.util.Scanner;

public class CoordinateSystem {

    // uzupełnij metodę. Używaj scannera przekazanego w parametrze.
    void run(Scanner scanner) {
        System.out.println("Podaj punkt x");
        int x = scanner.nextInt();
        System.out.println("Podaj punkt y");
        int y = scanner.nextInt();
        Point point = new Point(x, y);
        checkQuarter(point, x, y);
    }

    private void checkQuarter(Point point, int x, int y) {
        if (onCenter(point)) {
            System.out.println("Punkt (" + x + ", " + y + ") " + "leży na środku układu współrzędnych");
        } else if (onX(point)) {
            System.out.println("Punkt (" + x + ", " + y + ") " + "leży na osi X");
        } else if (onY(point)) {
            System.out.println("Punkt (" + x + ", " + y + ") " + "leży na osi Y");
        } else if (firstQuarter(point)) {
            System.out.println("Punkt (" + x + ", " + y + ") " + "leży w I ćwiartce układu współrzędnych");
        } else if (secondQuarter(point)) {
            System.out.println("Punkt (" + x + ", " + y + ") " + "leży w II ćwiartce układu współrzędnych");
        } else if (thirdQuarter(point)) {
            System.out.println("Punkt (" + x + ", " + y + ") " + "leży w III ćwiartce układu współrzędnych");
        } else if (fourthQuarter(point)) {
            System.out.println("Punkt (" + x + ", " + y + ") " + "leży w IV ćwiartce układu współrzędnych");
        }
    }

    boolean firstQuarter(Point point) {
        return point.getX() > 0 && point.getY() > 0;
    }

    boolean secondQuarter(Point point) {
        return point.getX() < 0 && point.getY() > 0;
    }

    boolean thirdQuarter(Point point) {
        return point.getX() < 0 && point.getY() < 0;
    }

    boolean fourthQuarter(Point point) {
        return point.getX() > 0 && point.getY() < 0;
    }

    boolean onCenter(Point point) {
        return point.getX() == 0 && point.getY() == 0;
    }

    boolean onX(Point point) {
        return (point.getY() == 0 && (point.getX() > 0 || point.getX() < 0));
    }

    boolean onY(Point point) {
        return (point.getX() == 0 && (point.getY() != 0));
    }
}
