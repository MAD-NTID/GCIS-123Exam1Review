package Exam1Review;

/**
 * Answer to 4b
 */
public class Shapes
{
    final ShapeInterface[] shapes;
    public Shapes(ShapeInterface[] shapes)
    {
        this.shapes = shapes;
    }

    @Override
    public String toString()
    {
        ShapeInterface largest = null;

        for(int i = 0; i < shapes.length; i++){
            ShapeInterface element = shapes[i];
            if(largest == null)
                largest = element;
            else if(element.getArea() >  largest.getArea())
                largest = element;
        }

        return largest.toString();
    }

    public static void main(String[] args)
    {
        ShapeInterface[] shapesArray = {
                new Triangle(4),
                new Square(10)
        };

        Shapes shapes = new Shapes(shapesArray);
        System.out.println(shapes.toString());
    }
}
