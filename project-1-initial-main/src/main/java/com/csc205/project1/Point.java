// Program Name: Point.java
// Author: Sofia Ruiz
// Class: CSC205AA 38142
// Date: 09/2021
// Description: Creates and modifies point objects, can also
//              calculate distance between coordinates of two pointa

package com.csc205.project1;

public class Point
{
    private double x;
    private double y;
    public Point ()
    {
        x = 0.0;
        y = 0.0;  //creates new Point object with coordinate (0,0)
    }
    public Point (double x, double y)
    {
        this.x = x;
        this.y = y; //creates new Point object with custom coordinates
    }
    public void setX(double x)
    {
        this.x = x; //sets or changes x-coordinate of point
    }
    public void setY(double y)
    {
        this.y = y; //sets or changes y-coordinate of point
    }
    public void setPoint( double x, double y)
    {
        this.x = x;
        this.y = y; //sets or changes the coordinates of point
    }
    public void shiftX(double n)
    {
        x += n; // moves the point left or right
    }
    public void shiftY(double n)
    {
        y += n; //moves point up or down
    }
    public double getX()
    {
        return x; //returns the x-coordinate of point
    }
    public double getY()
    {
        return y; //returns the y-coordinate of point
    }
    public double distance(Point p2)
    {
        // distance formula is the square root of the sum of the squares
        // of the difference of the x values and y-values

    double x2 = p2.getX();
    double y2 = p2.getY();
    double d;
        d = Math.sqrt(
                (Math.pow((x2 - x), 2)) + Math.pow((y2- y), 2)
        );
        return d;
    }

    public void rotate(double angle)
    {
        // rotation aroudn origin is x' = xcos(theta) - ysin(theta)
        // y = xsin(theta) + ycos(theta)

        x = ( (x * Math.cos(angle)) - (y * Math.sin(angle)) );
        y = ( (x * Math.sin(angle)) + (y * Math.cos(angle)) );
    }

    public String toString( )
    {
        return ("Point{x = " + x + ", y = " + y + "}");
    }

}
