package Interface_Shapes_Homework;
/*
    В задаче из прошлого дз про интерфейс Shape добавить метод,
      позволяющий высчитывать общую площадь разных фигур totalSquare().
      Пример: площадь прямоугольника 100, площад круга 50, общая площадь 150
      Написать этот метод в классе ShapeCalculator
      Протестировать этот метод с помощью JUnit
     */
     public class ShapeCalculator {




    public double totalSquare ( Shape[] shapes){
       double res= 0 ;

       for (Shape s : shapes){
           res += s.getArea();

       }
       return res;






    }
}
