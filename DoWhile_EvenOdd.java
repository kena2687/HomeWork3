package HomeWork3;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class DoWhile_EvenOdd {

    public static void main(String[] args) {
        int i = 1;
        int j = 2;

        do {
            System.out.println("Even no:" +j);
            j+=2;
            System.out.println("Odd no:" +i);
            i+=2;
        }
        while (i<=20);
    }
}
