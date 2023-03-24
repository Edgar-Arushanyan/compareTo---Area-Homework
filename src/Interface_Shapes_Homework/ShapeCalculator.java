package Interface_Shapes_Homework;

public class ShapeCalculator {
    /*
    В задаче из прошлого дз про интерфейс Shape добавить метод,
      позволяющий высчитывать общую площадь разных фигур totalSquare().
      Пример: площадь прямоугольника 100, площад круга 50, общая площадь 150
      Написать этот метод в классе ShapeCalculator
      Протестировать этот метод с помощью JUnit


     */

    public static double totalSquare(double circle, double rectangle, double square){
       double area= circle+rectangle+square ;
       return area;




    }
}
