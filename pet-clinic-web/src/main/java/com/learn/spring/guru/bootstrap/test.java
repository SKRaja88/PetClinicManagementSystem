package com.learn.spring.guru.bootstrap;

import java.util.Scanner;
import java.util.regex.Pattern;

class MyExc1 extends Exception{}
class MyExc2 extends Exception{}
class MyExc3 extends MyExc2{}

public class test {

    public static void main(String[] args)  throws Exception {

   /*     try{
            System.out.print(1);
            q();

        }catch(Exception i)  {
        throw (new MyExc2());
        }finally{
            System.out.print(2);
            throw (new MyExc1());
        }

    }
    static void q() throws Exception{
        try{
            throw (new MyExc1());
        }catch(Exception y){}finally  {
            System.out.print(3);
            throw (new Exception());
        }

/////////////////////////////////////////////////////////////////////

 int N = 29;

        if (N % 2 == 0 && ((N > 2 && N < 5) || N > 20)) {
            System.out.println("Not Weird");
        } else if (N % 2 != 0 && ((N > 6 && N < 20))) {
            System.out.println("Weird");
        }else{
            System.out.println("Weird");
        }
    }*/


    }
}
