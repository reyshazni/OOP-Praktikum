
/**
 * Main.java
 * Program menguji HashMap
 * 
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

import java.util.Scanner;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opnum = sc.nextInt();

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (int i = 1; i <= opnum; i++) {
            String op = sc.next();
            if (op.equals("PUT")) {
                hashMap.put(sc.next(), Integer.parseInt(sc.next()));
                ;
            } else if (op.equals("GET")) {
                System.out.println(hashMap.get(sc.next()));
            } else if (op.equals("REMOVE")) {
                hashMap.remove(sc.next());
            } else if (op.equals("CLEAR")) {
                hashMap.clear();
            }
        }
        sc.close();
    }
}
