import java.util.Scanner;
import java.lang.System;
import java.io.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisBensin = input.next();

        Car Car1 = new Car(jenisBensin);

    }
}
