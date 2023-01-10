package HomeWork3;

import java.util.Scanner;

public class ForLoops_Scannerclass_TimeTable {

    public static void main(String[] args) {
        int num;
         System.out.println("Time Table of: ");
         Scanner table = new Scanner(System.in);
        num = table.nextInt();


        for (int i= 1; i<=10; i++)
        {
            System.out.println(num+"*"+i+"="+num*i);

        }

    }
}