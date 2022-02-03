/**
 * EmployeePerformance.java
 * [Kelas EmployeePerformance merupakan sebuah kelas yang memodelkan detail performa dari karyawan.]
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class EmployeePerformance {
    public Employee employee;
    private double currentPoints;
    private double targetPoints;

    /**
     * Konstruktor
     * @param employee
     * @param currentPoints
     * @param targetPoints
     */
    public EmployeePerformance(Employee employee, double currentPoints, double targetPoints) {
        this.employee = employee;
        this.currentPoints = currentPoints;
        this.targetPoints = targetPoints;
    }

    /**
     * Apakah bisa dipromosi jabatan
     * promosi jabatan bisa dilakukan jika currentPoints >= 2 * targetPoints
     * @return true jika bisa, false jika tidak
     */
    public boolean isPromotable() {
        if (currentPoints >= 2*targetPoints) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Hitung desimal persentase bonus dengan perhitungan berikut:
     * @formula: (currentPoints - targetPoints) / targetPoints
     * 
     * @batasan: 0 (0%) <= desimal persentase bonus <= 1.0 (100%)
     * apabila hasil perhitungan desimal persentase bonus berada diluar batasan, 
     * nilai diubah menjadi nilai terdekat yang terdefinisi. 
     * 
     * @return desimal persentase bonus
     */
    public double getSalaryBonusPercentage() {
        double bonus = (currentPoints - targetPoints) / targetPoints;
        if (bonus < 0) {
            return 0;
        } else if (bonus > 1) {
            return 1.00;
        } else {
            return bonus;
        }
    }

    /**
     * Hitung total salary saat ini dengan ditambah persen dari bonus (getSalaryBonusPercentage)
     * misal baseSalary $1000, dengan bonus 50% (desimal 0.5) akan menjadi $1500
     * @return total salary saat ini
     */
    public double getCurrentSalary() {
        double bonus = getCurrentSalary();
        return employee.baseSalary + (bonus*employee.baseSalary);
    }
}