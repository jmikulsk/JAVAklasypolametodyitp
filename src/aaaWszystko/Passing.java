package aaaWszystko;

import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Przed zmianą " + i);
        changeIt(i);
        System.out.println("Przed zmianą " + i);

        Point p = new Point(1,1);
        System.out.println("zieniam to na co wskazuje p" +p);
        changeIt(p);
        System.out.println("Po zmianie " + p);


    }


    static  void changeIt(int i){
        System.out.println("Zmieniam i....");
        i++;

    }
    static void changeIt(Point p){
//        p= new Point(4,4);
        System.out.println("zmieniam to co wskazuje p");
        p.x ++;
        p.y ++;
    }
}
