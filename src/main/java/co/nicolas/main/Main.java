package co.nicolas.main;

import java.util.ArrayList;
import co.nicolas.dominio.Computador;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Computador> pcs = new ArrayList<Computador>();
		Computador pc1 = new Computador(11, "Samsung", "A001", 1000, 1, false);
		Computador pc2 = new Computador(11, "Samsung", "A001", 1000, 1, false);
		Computador pc3 = new Computador(11, "Samsung", "A001", 1000, 1, false);
		
		Computador pc4 = new Computador(22, "Lenovo", "A002", 2000, 1, false);
		Computador pc5 = new Computador(22, "Lenovo", "A002", 2000, 1, false);
		Computador pc6 = new Computador(22, "Lenovo", "A002", 2000, 1, false);
		
		Computador pc7 = new Computador(33, "Pc Smart", "A003", 3000, 1, true);
		Computador pc8 = new Computador(33, "Pc Smart", "A003", 3000, 1, true);
		Computador pc9 = new Computador(33, "Pc Smart", "A003", 3000, 1, true);
		
		Computador pc10 = new Computador(44, "HP", "A004", 4000, 1, false);
		Computador pc11 = new Computador(44, "HP", "A004", 4000, 1, false);
		Computador pc12 = new Computador(44, "HP", "A004", 4000, 1, false);
		
		Computador pc15 = new Computador(54, "Sony", "A005", 5000, 1, true);
		Computador pc16 = new Computador(54, "Sony", "A005", 5000, 1, true);
		Computador pc17 = new Computador(54, "Sony", "A005", 5000, 1, true);
		
		pcs.add(pc1);
		pcs.add(pc2);
		pcs.add(pc3);
		pcs.add(pc4);
		pcs.add(pc5);
		pcs.add(pc1);
		pcs.add(pc2);
		pcs.add(pc3);
		pcs.add(pc4);
		pcs.add(pc5);
		pcs.add(pc2);
		pcs.add(pc3);
		pcs.add(pc4);
		pcs.add(pc5);


	}
}
