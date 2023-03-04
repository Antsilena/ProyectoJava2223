package fp.coches.test;

import java.time.LocalDate;
import java.util.List;

import fp.coches.Coche;
import fp.coches.Colores;

public class TestCoches {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Acura", "Integra", 16919, 16.36, true, 21.5, 1.8, 
				140, 101.2, 67.3, 172.4, 2.639, 13.2, 28, LocalDate.of(2014, 2, 2), 
				List.of(Colores.BLANCO,Colores.NEGRO,Colores.ROJO,Colores.AZUL));
		Coche c2 = new Coche("Acura", "TL", 39384, 19.875, true, 28.4, 3.2, 225, 
				108.1, 70.3, 192.9, 3.517, 17.2, 25, LocalDate.of(2015, 3, 6), 
				List.of(Colores.BLANCO,Colores.NEGRO,Colores.ROJO,Colores.AZUL));
		Coche c3 = new Coche("BMW","323i",true,2.5,170,107.3,16.6,26);
		System.out.println(c1.descripcionEnPortalDeVenta());
		System.out.println(c2.toString());
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.equals(c2));
		System.out.println(c1.getCaballos());
		System.out.println(c3.toString());
	}

}
