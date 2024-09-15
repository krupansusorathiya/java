package main.src.com.krupansu;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n )

        {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }

    public static class Loops {
        public static void main(String[] args) {



            //----------------four loop-----------------------

    //        for (int num = 1; num <= 5; num += 1) {
    //            System.out.println(num);
    //        }



            //----------------print hello--------------------------------

    //        Scanner in = new Scanner(System.in);
    //        int n = in.nextInt();
    //
    //        for (int num = 1; num <= n ; num ++ ){
    //
    //            System.out.println(" hello");
    //        }





            //---------------------while loop====================

    //        syntax
    //        while (condition){
    //         body
    //        }


    //        int num = 1;
    //        while(num <= 5 ){
    //            System.out.println(num);
    //            num += 1;
    //        }


            //----------------------do while loop------------------------------------

    //        syntax
    //                do{
    //                      body
    //                }
    //                while(condition);

            int n = 1;
            do{
                System.out.println("hello");
                n++;
            }
            while (n <= 6);



            }
        }
}


