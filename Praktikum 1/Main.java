/**
 * Main.java
 * [Membaca input berupa name, baseSalary, currentPoints, dan targetPoints lalu mengeluarkan output berupa apakah employee promotable
 *  dan apabila iya, akan mengeluarkan jumlah salary, apabila tidak, akan mengeluarkan point yang dibutuhkan agar bisa promosi]
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        double baseSalary = scanner.nextDouble();
        double currentPoints = scanner.nextDouble();
        double targetPoints = scanner.nextDouble();
        
        Employee employee = new Employee(name, baseSalary);
        EmployeePerformance employeeperformance = new EmployeePerformance(employee, currentPoints, targetPoints);

        if (employeeperformance.isPromotable()) {
            System.out.println("YES");
            System.out.printf("%.2f\n", employeeperformance.getCurrentSalary());
        } else {
            System.out.println("NO");   
            System.out.printf("%.2f\n", 2*targetPoints - currentPoints);         
        }

    }
}