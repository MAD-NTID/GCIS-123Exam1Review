package Exam1Review;


public class Triangle implements ShapeInterface
{
    /** A constant to represent the number of sides in a triangle **/
    final int SIDES = 3;

    final double sideLength;

    /**
     * This method takes the side length and initialize it
     * @param sideLength the length of the side
     */
    public Triangle(int sideLength)
    {
        this.sideLength = sideLength;
    }
    /**
     * @return This returns the area of the shape
     */
    public double getArea() {
        return (1/2.0) * (sideLength * sideLength);
    }

    /**
     * @return This return the sides of the shape
     */
    public int getSides() {
        return SIDES;
    }

    @Override
    public String toString()
    {
        return String.format("Shape:%s Sides:%s", "Triangle", SIDES);
    }
}
