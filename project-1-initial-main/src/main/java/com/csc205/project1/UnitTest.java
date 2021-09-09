package com.csc205.project1;

public class UnitTest
{
    public static void main(String[] args) {

        System.out.println("Project 1 : Unit Tester\n");

        Point a = new Point(5.0,5.0);
        Point b = new Point(1.0, 0.0);

        System.out.println("Point 1: " + a);
        System.out.println("Point 2: " + b);

        a.shiftX(-3);
        a.shiftY(-1);


        System.out.println("\nPoint 1 after shifting left 3 units, and down 1 unit:\n" + a);

        b.rotate((Math.PI));

        System.out.println("\nPoint 2 after rotating 180 degrees:\n" + b);

       System.out.println( "\nDistance between Point 1 and Point 2: " +  a.distance(b));

    }
}
/*
Output:
Project 1 : Unit Tester

Point 1: Point{x = 5.0, y = 5.0}
Point 2: Point{x = 1.0, y = 0.0}

Point 1 after shifting left 3 units, and down 1 unit:
Point{x = 2.0, y = 4.0}

Point 2 after rotating 180 degrees:
Point{x = -1.0, y = -1.2246467991473532E-16}

Distance between Point 1 and Point 2: 5.0

Process finished with exit code 0
*/
