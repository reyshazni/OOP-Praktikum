/**
 * Employee.java
 * [Jelaskan kegunaan class ini]
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class Employee {
    private static int employeeCount = 0;

    private String name;
    private double baseSalary;

    /**
     * Konstruktor
     * @param name
     * @param baseSalary
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    /**
     * Menambahkan gaji pegawai
     * @param amount jumlah peningkatan, asumsi amount >= 0
     */
    public void increaseSalary(double amount) {
        this.baseSalary += amount;
    }

    /**
     * Getter name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter baseSalary
     * @return baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @return jumlah karyawan
     */
    public static int getEmployeeCount() {
        return employeeCount;
    }
}
