import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class sidebysideexample {
    public static void main(String[] args) {

//        int x = 11;
//        float y = 5;
//        ++x;
//        System.out.println(x/y);
//        int []  age = {12, 4, 7};
//        System.out.println("Using for-each Loop:");
//
//        for (int a : age) {
//
//            System.out.println(a);
//        }
//
//            int []  year = {1, 3, 7, 8, 5};
//            System.out.println("Using for Loop:");
//
//            for (int i = 0; i < year. length; i++) {
//
//                System.out.println(i);
//
//        }
//         double x = 100000;
//         double y = 2;
//        double Interest;
//        Interest = (double) (15/100);

        double x = 0.15;
        int y = 3;
        int a = 100000;
        double interestamount = x*a;
        double totalinterest = interestamount*y;
        double totalloanandinterest = totalinterest + a;

        System.out.println(totalloanandinterest);

    }
}