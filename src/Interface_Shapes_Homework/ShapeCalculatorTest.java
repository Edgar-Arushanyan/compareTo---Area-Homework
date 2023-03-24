package Interface_Shapes_Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCalculatorTest {
    ShapeCalculator shapeCalculator;


    @BeforeEach
    void init(){
       shapeCalculator = new ShapeCalculator();
    }

    @Test
    public void test_two_shapes() {
        Shape[] shapes = {new Circle("Circle",10), new Rectangle("Rectanle",5,10)};
                assertEquals(364, shapeCalculator.totalSquare(shapes));


    }
    @Test
    public void test_one_shape(){
        Shape[] shapes = {new Rectangle("Rectangle", 5,10)};

        assertEquals(50, shapeCalculator.totalSquare(shapes));
    }
    @Test
    public void test_zero_shape(){
        Shape[] shapes ={};
        assertEquals(0,shapeCalculator.totalSquare(shapes));
    }





    // Tests passed 1


            // Areas of shapes
        //   Circle has area of 314.0
        //   Rectangle has area of 50.0
        //   Square has area of 225.0

}



