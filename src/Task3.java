public class Task3 {
    /*Создать класс, объекты которого будут неизменяемыми.
Класс инкапсулирует в себе информацию о треугольнике на
плоскости (длины каждой из его ребер). Длины сторон задаются в конструкторе. Если по заданным сторонам нельзя
построить треугольник, в конструктор должно бросаться
исключение.*/


    //Полностью ли соответствует решение условию???
    public static void main(String[] args) throws NumChecedException {
        Triangle triangle= new Triangle(3,2,3);


    }
}
class Triangle{
    private final int sideTriangle1;
    private final int sideTriangle2;
    private final int sideTriangle3;

    public Triangle(int sideTriangle1, int sideTriangle2, int sideTriangle3) throws NumChecedException {
        this.sideTriangle1 = sideTriangle1;
        this.sideTriangle2 = sideTriangle2;
        this.sideTriangle3 = sideTriangle3;

       if (sideTriangle1+sideTriangle2<sideTriangle3 || sideTriangle2+sideTriangle3<sideTriangle1 || sideTriangle1+sideTriangle3<sideTriangle2)
        throw new NumChecedException("can't create a triangle");

    }

}
