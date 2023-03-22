package Interface_Shapes_Homework;

import java.util.Arrays;

public class Main {
    /*В задаче из урока 40 вывести на печать массив ,отсортированный по возрастанию площади фигур.
     Задача была такая:
    Создать классы содержащие методы для подсчета площади прямоугольника , квадрата, круга:
    Создать классы Circle, Rectangle, Square.
    В классах должен быть метод getArea, осуществляюший подсчет соответствующей площади
    В методе main класса Main создать массив или лист содержащий обьекты этих
    классов и   вывести на экран площади фигур, содержащего в этом массиве а также
    название фигуры.
    Подумать должны ли быть созданы для выполненя задачи еще какие то классы/класс
    и поля в классе/классах
    Пример вывода на печать:
    Circle has area of 200
    Rectangle has area of 50.0
    Square has area of 30.0
     */
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("Rectangle",5,10);
        Shape square = new Square("Square",15);
        Shape circle = new Circle("Circle",10);

        Shape[] shapes= {circle,rectangle,square};
        Arrays.sort(shapes);

        System.out.println("Shapes: ");
        for (Shape s : shapes){
            System.out.println(s.getDisplayName()+" has area of "+s.getArea());
        }
       /* Output:
        Shapes:
        Circle has area of 314.0
        Rectangle has area of 50.0
        Square has area of 225.0
        [
        Shape{displayName='Rectangle'},
        Shape{displayName='Square'},
        Shape{displayName='Circle'}]


        */




    }
}
