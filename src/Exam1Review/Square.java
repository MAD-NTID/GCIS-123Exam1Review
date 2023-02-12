package Exam1Review;


public class Square implements ShapeInterface
{
    /** A constant that represent the number of sides in a Exam1Review.Square**/
    final int SIDES = 4;

    final int sideLength;

    /**
     * This method takes the side length and initialize it
     * @param sideLength the length of the side
     */
    public Square(int sideLength)
    {
        this.sideLength = sideLength;
    }
    /**
     * @return This returns the area of the shape
     */
    public double getArea() {
        return this.sideLength * SIDES;
    }

    /**
     * @return This return the sides of the shape
     */
    public int getSides() {
        return this.SIDES;
    }

    @Override
    public String toString()
    {
        return String.format("Shape:%s Sides:%s", "Square", SIDES);
    }
}
