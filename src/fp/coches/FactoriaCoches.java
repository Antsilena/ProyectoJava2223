package fp.coches;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import fp.utiles.Checkers;
import fp.utiles.Ficheros;
public class FactoriaCoches {
	public static Set<Coche> leerCoches(String fichero) {
		Checkers.checkNoNull(fichero);
		Set<Coche> res = new HashSet<Coche>();
		String errMsg = "Error leyendo fichero " + fichero;
		List<String> lineas = Ficheros.leeFichero(errMsg, fichero);
		lineas.remove(0); // Eliminar cabecera del fichero
		for (String linea: lineas) {
			res.add(parsearcoches(linea));
		}
		return res;
	}
	
	public static EstudioCoches leerCoches(String nombre, String fichero) {
		EstudioCoches res = null;
		try {
			Stream<Coche> s =
			Files.lines(Paths.get(fichero))
				.skip(1)
				.map(FactoriaCoches::parsearcoches);
			res = new EstudioCoches(nombre, s);
		} catch (IOException e) {
			System.out.println("No se ha encontrado el fichero " + fichero);
			e.printStackTrace();
		}
		return res;
	}
	
	//Declaracion de las columnas del dataset
	
	private static Coche parsearcoches(String lineaCSV) {
		  
		//Trocear cadena
		
		String[] sp = lineaCSV.split(";");
		Checkers.check("Cadena con formato no válido", sp.length == 20);	
		
		//Convertir trozos al tipo correspondiente
		
		String constructor = sp[0].trim();
		String modelo = sp[1].trim();
		Integer ventasMiles = Integer.valueOf(sp[2].trim());
		Double reventaValor =  Double.valueOf(sp[3].trim());
		Boolean esPasajeros = Boolean.valueOf(sp[4].trim().equals("Passenger"));
		Double precioMiles = Double.valueOf(sp[5].trim()); 
		Double tamanoMotor = Double.valueOf(sp[6].trim());
		Integer caballos = Integer.valueOf(sp[7].trim());
		Double distanciaEjes = Double.valueOf(sp[8].trim());
		Double ancho = Double.valueOf(sp[9].trim());
		Double largo = Double.valueOf(sp[10].trim());
		Double peso = Double.valueOf(sp[11].trim());
		Double capacidadGasolina = Double.valueOf(sp[12].trim());
		Integer eficienciaGasolina = Integer.valueOf(sp[13].replace("0.0", "0").trim());
		LocalDate ultimoLanzamiento = LocalDate.parse(sp[14], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		List<Colores> colores = List.of(Colores.valueOf(sp[15].trim()), Colores.valueOf(sp[16].trim()), Colores.valueOf(sp[17].trim()), 
				Colores.valueOf(sp[18].trim()), Colores.valueOf(sp[19].trim()));
		
		
		//Creacion objeto
		return new Coche(constructor, modelo, ventasMiles, reventaValor, esPasajeros, precioMiles, 
				tamanoMotor, caballos, distanciaEjes, ancho, largo, peso, capacidadGasolina, 
				eficienciaGasolina, ultimoLanzamiento, colores);
	}
}