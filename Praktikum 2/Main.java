/**
 * Main.java
 * [Menerima input dan mengeluarkan output]
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

import java.lang.System;
import java.util.Scanner;

public class Main {
    private static Car carType;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int type = scan.nextInt();
        if (type == 1) {
            carType = new Bus(scan.nextInt());
        } else if (type == 2){
            int numWheel = scan.nextInt();
            boolean isLoad = scan.nextBoolean();
            carType = new Truck(numWheel,isLoad);
        } else if (type == 3){
            carType = new Van(scan.nextInt());
        }
        System.out.println(carType.toString());
        System.out.println(carType.getPrice());
        carType.increaseMileage(scan.nextLong());
        System.out.println(carType.toString());
        System.out.println(carType.getPrice());
    }
}
