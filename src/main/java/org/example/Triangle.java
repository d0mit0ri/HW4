package org.example;

public class Triangle
{
    public static int judgeTri(int a,int b,int c){
        System.out.println("Параметр:" + a + "" + b + "" + c);
        int result = -1;
        if(a <=0 || b <= 0 || c<= 0){
            System.out.println("return -1 --------------: не треугольник");
            return result;
        }
        if(a + b > c && a + c > b && b + c > a){
            result = 0;
            if(a == b  && a == c){
                System.out.println("return 2 --------------: Равносторонний треугольник");
                result = 2;
            }else if(a ==b || a == c || b== c){
                System.out.println("return 1 --------------: Равнобедренный треугольник");
                result = 1;
            }else {
                System.out.println("return 0 --------------: обычный треугольник");
            }
        }else{
            System.out.println("return -1 --------------: не треугольник");
        }
        return result;
    }
}