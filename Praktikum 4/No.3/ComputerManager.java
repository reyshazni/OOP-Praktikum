
/**
 * ComputerManager.java
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

import java.util.ArrayList;
import java.util.List;

public class ComputerManager {
    private List<Computer> list = new ArrayList<Computer>();

    /**
     * Menambahkan komputer ke array
     * 
     * @param computer objek Computer
     */
    public void addComputer(Computer computer) {
        // Tambahkan komputer ke list
        this.list.add(computer);

    }

    /**
     * Menyalakan monitor semua komputer yang mempunyai monitor
     * dengan metode turnOnMonitor
     */
    public void turnOnAllMonitors() {
        for (Computer compu : this.list) {
            if (compu instanceof Monitor) {
                ((Monitor) compu).turnOnMonitor();
            }
        }
    }

    /**
     * Mematikan monitor semua komputer yang mempunyai monitor
     * dengan metode turnOffMonitor
     */
    public void turnOffAllMonitors() {
        for (Computer compu : this.list) {
            if (compu instanceof Monitor) {
                ((Monitor) compu).turnOffMonitor();
            }
        }
    }

    /**
     * Mencetak spesifikasi semua komputer
     * dengan metode printSpecification
     */
    public void printAllSpecifications() {
        for (Computer compu : this.list) {
            compu.printSpecification();
        }
    }

    /**
     * Memindahkan semua komputer yang portable
     * dengan metode move
     */
    public void moveAllPortableComputers() {
        for (Computer compu : this.list) {
            if (compu instanceof Portable) {
                ((Portable) compu).move();
            }
        }
    }

    /**
     * Menggunakan keyboard semua komputer yang memiliki keyboard
     * dengan metode useKeyboard
     */
    public void useAllKeyboards() {
        for (Computer compu : this.list) {
            if (compu instanceof Keyboard) {
                ((Keyboard) compu).useKeyboard();
            }
        }
    }

}
