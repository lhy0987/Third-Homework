/**
 * Created by lhy on 2016/10/27.
 */
abstract class Shape{
    int baseside = 3; //三角形的底
    int height = 2; //三角形的高
    int side = 3; //正方形的边长
    int radius = 3; //圆的半径
    double PI = 3.14; //圆周率

    abstract void area();
}
class Triangle extends Shape {

    @Override
    void area() {
        System.out.println("三角形的面积：" + 0.5*baseside*height);
    }
}
class Square extends Shape {

    @Override
    void area() {
        System.out.println("正方形的面积：" + side*side);
    }
}
class Circular extends Shape {

    @Override
    void area() {
        System.out.println("圆的面积：" + (double)(radius*radius)*PI);
    }
}
class area {
    public static void main(String[] args) {
        Triangle Triangle = new Triangle();
        Triangle.area();
        Square Square = new Square();
        Square.area();
        Circular Circular = new Circular();
        Circular.area();
    }
}


// 大佬，写得渣，感觉偏离题意了，求不要骂得太惨(>﹏<)，感谢(∩_∩)
