package HomeWork3;

import java.util.Scanner;

public class DoWhile_Timetable {

    public static void main(String[] args) {

        int num;
        int i = 1;

        System.out.println("Time Table of : ");
        Scanner table = new Scanner(System.in);
        num = table.nextInt();

        do {
            System.out.println(num+"*"+i+"="+num*i);
            i++;
           }
        while(i<=10);
    }
}
