package fp.coches.test;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import fp.coches.Coche;
import fp.coches.Colores;
import fp.coches.EstudioCoches;
import fp.coches.FactoriaCoches;

public class TestEstudioCoches {

	public static void main(String[] args) {
		//Creacion del conjunto de coches
		EstudioCoches ec = new EstudioCoches("Coches");
		
		//Creacion de objetos
		Coche c1 = new Coche("Acura", "Integra", 16919, 16.36, true, 21.5, 1.8, 
				140, 101.2, 67.3, 172.4, 2.639, 13.2, 28, LocalDate.of(2014, 2, 2), 
				List.of(Colores.BLANCO,Colores.NEGRO,Colores.ROJO,Colores.AZUL));
		Coche c2 = new Coche("Acura", "TL", 39384, 19.875, true, 28.4, 3.2, 225, 
				108.1, 70.3, 192.9, 3.517, 17.2, 25, LocalDate.of(2015, 3, 6), 
				List.of(Colores.BLANCO,Colores.NEGRO,Colores.ROJO,Colores.AZUL));
		Coche c3 = new Coche("Audi", "A4", 20397, 22.255, true, 23.99, 1.8, 150,
				102.6, 68.2, 178.0, 2.998, 16.4, 27, LocalDate.of(2015, 8, 10), 
				List.of(Colores.BLANCO,Colores.NEGRO,Colores.ROJO,Colores.AZUL));
		Coche c4 = new Coche("Audi", "A6", 1878, 23.555, true, 33.95, 2.8, 200,
				108.7, 76.1, 192.0, 3.561, 18.5, 22, LocalDate.of(2015, 9, 8), 
				List.of(Colores.BLANCO,Colores.NEGRO,Colores.ROJO,Colores.AZUL));
		Coche c5 = new Coche("Cadillac", "Seville", 15943, 27.1, true, 44.475, 4.6, 275,
				112.2, 75.0, 201.0, 3.712, 18.5, 22, LocalDate.of(2015, 4, 29), 
				List.of(Colores.BLANCO,Colores.GRIS,Colores.ROJO,Colores.AZUL,Colores.GRIS));
		
		//Añade coches al contenedor
		ec.añadeCoches(c1);
		ec.añadeCoches(c2);
		ec.añadeCoches(c3);
		ec.añadeCoches(c4);
		ec.añadeCoches(c5);

		//Mostrar peliculas
		System.out.println(ec.toString());
		
		//Mostrar numero de coches
		System.out.println("\nTenemos "+ec.getNumeroCoches()+" coches en el contenedor");
		
		//Elimina coches
		System.out.println("\nEliminamos un coche... ");
		ec.eliminaCoches(c5);
		System.out.println("Ahora tenemos "+ec.getNumeroCoches()+" coches en el contenedor");
		
		//Comprobamos si el contenedor contiene un coche
		System.out.println("\n¿El contenedor contiene al coche 4? "+ec.contieneCoche(c4));
		System.out.println("\n¿El contenedor contiene al coche 5? "+ec.contieneCoche(c5));
		System.out.println("\nAñadimos de nuevo al coche 5...");
		ec.añadeCoches(c5);
		
		//Tratamientos Secuenciales
		//Existe coche de pasajeros de mas de x euros
		Double precio1 = 24.0;
		System.out.println("\n¿Existe algun coche en el contenedor con precio mayor a "+precio1+" miles de euros? "+ec.existeVehiculoMasXEuros(precio1));
		Double precio2 = 100.0;
		System.out.println("\n¿Existe algun coche en el contenedor con precio mayor a "+precio2+" miles de euros? "+ec.existeVehiculoMasXEuros(precio2));
		
		///Media dimensiones vehiculos filtrado por comercial/pasajeros (True: pasajeros, False: comercial)
		Boolean esPasajero = true;
		System.out.println("\nLa media de dimensiones en vehiculos de pasajero es: "+ec.mediaProporciones(esPasajero)/10000+" m^2");
		
		//Coches con mas de x caballos
		Integer numCaballos = 150;
		System.out.println("\nLos coches con mas de "+numCaballos+" caballos son: "+ec.masDeXCaballos(numCaballos));
		
		//Map de Constructor como clave y lista de modelos como valor
		System.out.println("\nLos modelos que tiene cada constructor es: "+ec.constructorModelos());
		
		//Numero de ventas en miles por constructor
		System.out.println("\nLos numeros de ventas en miles por constructor son: "+ec.numeroVentasConstructor());
		
		
		//Lectura de Fichero
		System.out.print("\nLeyendo fichero de coches...");
		EstudioCoches estudio = new EstudioCoches("Coches");
		Set<Coche> setcoches =
				FactoriaCoches.leerCoches("data/Coches.csv");
		estudio.añadeSetCoches(setcoches);
		System.out.println(" leídas " + estudio.getNumeroCoches() 
			+ " peliculas.");
		
		
		//Existe coche de pasajeros de mas de x euros con Stream
		Double precio3 = 24.0;
		System.out.println("\n¿Existe algun coche con precio mayor a "+precio3+" miles de euros? "+estudio.existeVehiculoMasXEuros(precio3));
		Double precio4 = 100.0;
		System.out.println("\n¿Existe algun coche con precio mayor a "+precio4+" miles de euros? "+estudio.existeVehiculoMasXEuros(precio4));
		
		///Media dimensiones vehiculos filtrado por comercial/pasajeros (True: pasajeros, False: comercial) con Streams
		Boolean esPasajeroS = true;
		System.out.println("\nLa media de dimensiones en vehiculos de pasajero es: "+estudio.mediaProporciones(esPasajeroS)/10000+" m^2");
	
		//Coches con mas de x caballos con Streams
		Integer numCaballosS = 200;
		System.out.println("\nLos coches con mas de "+numCaballosS+" caballos son: "+estudio.masDeXCaballos(numCaballosS));
		
		//Map de Constructor como clave y lista de modelos como valor con Streams
		System.out.println("\nLos modelos que tiene cada constructor es: "+estudio.constructorModelos());

		//Numero de ventas en miles por constructor
		System.out.println("\nLos numeros de ventas en miles por constructor son: "+estudio.numeroVentasConstructorS());
		
		
		
	}

}
