package Interface_Shapes_Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCalculatorTest {
    ShapeCalculator calculatorArea;


    @BeforeEach

    void setUp(){
       calculatorArea = new ShapeCalculator();
    }

    @Test
    @DisplayName("Sum all areas")
    void totalSquare() {
        assertEquals (589.0, calculatorArea.totalSquare (314.0, 50.0,225.0));

        //   Circle has area of 314.0
        //   Rectangle has area of 50.0
        //   Square has area of 225.0

    }
}
