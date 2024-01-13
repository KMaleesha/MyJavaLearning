package oop;

public class Calculation {

    int width;
    int length;

    public void calculatePerimeter(){
        int perimeter = 2*(length + width);
        System.out.println("Perimeter is "+perimeter);
    }

    public void calculateArea(){
        int area = length*width;
        System.out.println("Area is : "+area);
    }

    public static void main(String[] args){
        Calculation rectangle = new Calculation();
        rectangle.width = 5;
        rectangle.length = 10;

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Calculation squre = new Calculation();
        squre.length = 7;
        squre.width = 7;

        squre.calculatePerimeter();
        squre.calculateArea();
    }
}
