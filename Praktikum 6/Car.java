import java.io.*;

public class Car {
	private static final int MAX_AC = 4;
	private static final int MIN_AC = 0;
	private static final int MAX_GEAR = 6;
	private static final int MIN_GEAR = 1;
	private String fuel;
	private int gear;
	private int acPower;
	private boolean on;

	// Constructor
	// Menginisiasi jenis fuel dengan tFuel, gear = 0, acPower = 0 dan on = false.
	public Car(String tFuel) {
		fuel = tFuel;
		gear = 0;
		acPower = 0;
		on = false;
	}

	// Getter
	public String getFuel() {
		return fuel;
	}

	public int getGear() {
		return gear;
	}

	public int getAcPower() {
		return acPower;
	}

	public boolean isOn() {
		return on;
	}

	/*
	 * Melakukan isi bensin terhadap mobil
	 * Melakukan pengecekan jenis bensin masukan apakah sesuai dengan jenis bensin
	 * mobil.
	 * - Bila tidak sesuai lakukan throw FuelException dengan parameter masukan
	 * tFuel
	 * - Bila sesuai, akan menghasilkan keluaran
	 * "Berhasil isi bensin sebanyak (nilai amountInLiter) liter" diakhiri newline
	 * dan abaikan tanda '()'
	 */
	public void fillingFuel(String tFuel, int amountInLiter) throws FuelException {
		if (tFuel != fuel) {
			throw new FuelException(tFuel);
		} else {
			System.out.println("Berhasil isi bensin sebanyak " + amountInLiter + " liter");
		}
	}

	/*
	 * Melakukan pergantian gigi mobil
	 * Melakukan pengecekan tGear sebagai masukan gigi apakah berada pada range
	 * MIN_GEAR<=X<=MAX_GEAR.
	 * - Bila tidak sesuai range lakukan throw InvalidInputCarException dengan
	 * parameter masukan tGear.
	 * - Bila sesuai, akan merubah nilai gear si mobil dan menghasilkan keluaran
	 * "Berhasil mengubah gigi menjadi gigi (nilai tGear)" diakhiri newline dan
	 * abaikan tanda '()'.
	 */
	public void changeGear(int tGear) throws InvalidInputCarException {
		if (tGear < MIN_GEAR || tGear > MAX_GEAR) {
			throw new InvalidInputCarException(tGear);
		} else {
			gear = tGear;
			System.out.println("Berhasil mengubah gigi menjadi gigi " + tGear);
		}
	}

	/*
	 * Melakukan pergantian power ac pada mobil
	 * Melakukan pengecekan tAcPower sebagai masukan power ac apakah berada pada
	 * range MIN_AC<=X<=MAX_AC.
	 * - Bila tidak sesuai range lakukan throw InvalidInputCarException dengan
	 * parameter masukan tAcPower.
	 * - Bila sesuai, akan merubah nilai acPower si mobil dan menghasilkan keluaran
	 * "Berhasil mengubah power ac menjadi (nilai tAcPower)" diakhiri newline dan
	 * abaikan tanda '()'.
	 */
	public void changeAcPower(int tAcPower) throws InvalidInputCarException {
		if (tAcPower < MIN_AC || tAcPower > MAX_AC) {
			throw new InvalidInputCarException(tAcPower);
		} else {
			acPower = tAcPower;
			System.out.println("Berhasil mengubah power ac menjadi " + tAcPower);
		}

	}

	/*
	 * Melakukan starter/ menyalakan mobil
	 * Melakukan pengecekan apakah mobil sudah dalam kondisi menyala atau belum
	 * ketika fungsi start dipanggil.
	 * - Bila mobil sudah menyala lakukan throw TheCarIsOnException.
	 * - Bila mobil belum menyala akan merubah nilai on mobil menjadi true dan
	 * menghasilkan keluaran
	 * "Berhasil melakukan starter mobil" diakhiri newline.
	 */
	public void start() throws TheCarIsOnException {
		if (on) {
			throw new TheCarIsOnException();
		} else {
			on = true;
			System.out.println("Berhasil melakukan starter mobil");
		}
	}

	/*
	 * Melakukan pergantian pengecekan seluruh fitur pada mobil
	 * Pengecekan fitur dilakukan dengan cara pemanggilan fungsi dengan urutan
	 * start -> fillingFuel dengan menggunakan parameter masukan pertama dan kedua
	 * -> changeGear dengan menggunakan parameter masukan ketiga
	 * -> changeAcPower dengan menggunakan parameter masukan keempat.
	 * 
	 * Implementasikan prosedur ini menggunakan try catch, dengan multiple catch,
	 * total tiga jenis catch.
	 * Untuk setiap Exception yang dicatch, cetak
	 * "[(nama_exception)] (message_exception)" diakhiri newline dan abaikan tanda
	 * '()'.
	 * Contoh:
	 * [TheCarIsOnException] Mobil sudah menyala
	 */
	public void service(String tFuel, int amountInLiter, int tGear, int tAcPower) {
		try {
			start();
			fillingFuel(tFuel, amountInLiter);
			changeGear(tGear);
			changeAcPower(tAcPower);
		} catch (FuelException | InvalidInputCarException | TheCarIsOnException e) {
			System.out.println("[" + e.getClass().getName() + "] " + e.getMessage());
		}
	}
}