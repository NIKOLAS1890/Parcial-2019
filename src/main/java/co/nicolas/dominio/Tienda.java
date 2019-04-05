package co.nicolas.dominio;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
	
	private static int CAPACIDAD_TOTAL = 15;
	private String nombre;
	private int capacidadActual = 15;
	private ArrayList<Computador> pcs = new ArrayList<Computador>();
	
	public Tienda(String nombre, int cantidadActual) {
		this.nombre = nombre;
		this.capacidadActual = cantidadActual;
	}
	
	public boolean agregarComputadorPc(Computador pc) {	
		boolean estaEnStock = false;

		for (int i = 0; i < pcs.size(); i++) {
			if(this.capacidadActual < 15 && pcs.get(i).getSerial() != pcs.get(i).getSerial() && estaEnStock == false) {
				estaEnStock = true;
				return true;
			
		}else if(pcs.get(i).isEsNuevo() != true || capacidadActual == 15) {
			pcs.add(pcs.get(i));			
			}
		}
		return false;
	}
	
	public List<Computador> buscarserial(long serial) {
		List<Computador> pcs = new ArrayList<Computador>();		
		
		for (int i = 0; i < pcs.size(); i++) {
			if(pcs.get(i).getSerial() == serial) {
				pcs.add(pcs.get(i));
			}
		}
		return pcs;
	}
	
	public Computador buscarmarca() {
		
		for (Computador computador : pcs) {
			if(computador.getMarca().equals(computador)) {
				return computador;
			}
		}
	
		return null;
	}
	
	public ArrayList<Computador> buscarSoloNuevos(boolean soloNuevos) {
		ArrayList<Computador> pcs = new ArrayList<>();
		for (Computador computador : this.pcs) {
			if(computador.isEsNuevo() == soloNuevos) {
				pcs.add(computador);
			}
		}
		return pcs;
	}
	
	public ArrayList<Computador> buscarQueValgaMenosDe(int precio) {
		ArrayList<Computador> pcs = new ArrayList<>();
		for (Computador computador : this.pcs) {
			if(computador.getPrecio() <= precio) {
				pcs.add(computador);
			}
		}
		return pcs;
	}
	
	public void vender(Computador pc) {
		int i = 0;
		for (Computador computador : pcs) {
			if(computador.getMarca().equals(computador.getMarca())) {
				System.out.println("Se ha vendido");
			}
			
			i++;
		}
		pcs.remove(i);
		this.capacidadActual = (15-this.pcs.size());
	}

	public int getCantidadActual() {
		return capacidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.capacidadActual = cantidadActual;
	}

	public static int getCAPACIDAD_TOTAL() {
		return CAPACIDAD_TOTAL;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCapacidadActual() {
		return capacidadActual;
	}

	public static void setCAPACIDAD_TOTAL(int cAPACIDAD_TOTAL) {
		CAPACIDAD_TOTAL = cAPACIDAD_TOTAL;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCapacidadActual(int capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
}
