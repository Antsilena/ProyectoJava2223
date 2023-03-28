package fp.coches;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;


import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.HashSet;
import java.util.Collections;

public class EstudioCoches {
	
	//Atributos
	private String nombre;
	private Set<Coche> coches;
	
	
	//C1
	public EstudioCoches(String nombre) {
		super();
		this.nombre = nombre;
		this.coches = new HashSet<>();
	}
	
	//C2
	public EstudioCoches(String nombre, Stream<Coche> coches) {
		super();
		this.nombre = nombre;
		this.coches = coches.collect(Collectors.toCollection(TreeSet::new));
	}
	//Getters
	public String getNombre() {
		return nombre;
	}

	public Set<Coche> getCoches() {
		return coches;
	}
	
	//Numero de coches
	public Integer getNumeroCoches() {
		return coches.size();
	}
	
	//Añade coches
	public void añadeCoches(Coche c) {
		coches.add(c);
	}
	
	//Elimina coche
	public void eliminaCoches(Coche c) {
		coches.remove(c);
	}
	
	//Contiene coche
	public Boolean contieneCoche(Coche c) {
		return coches.contains(c);
	}

	//Representacion como cadena
	@Override
	public String toString() {
		return "EstudioCoches [nombre=" + nombre + ", coches=" + coches + "]";
	}
	
	
	//Criterio de igualdad
	@Override
	public int hashCode() {
		return Objects.hash(coches, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstudioCoches other = (EstudioCoches) obj;
		return Objects.equals(coches, other.coches) && Objects.equals(nombre, other.nombre);
	}
	
//Tratamientos secuenciales
	
	//Existe coche de pasajeros de mas de x euros
	public Boolean existeVehiculoMasXEuros(Double precio) {
		Boolean res = false;
		for(Coche c: coches) {
			if(c.getEsPasajeros() && c.getPrecioMiles() > precio) {
				res=true;
			}
		}
		return res;
	}
	//Media dimensiones vehiculos filtrado por comercial/pasajeros (True: pasajeros, False: comercial)
		//Creamos una funcion auxiliar para calcular proporciones
		public Double proporciones(Coche c) {
			return c.getAncho()*c.getLargo();
		}
	public Double mediaProporciones(Boolean esPasajeros) {
		Double res = 0.0;
		for(Coche c: coches) {
			if(c.getEsPasajeros()==esPasajeros) {
				res += proporciones(c);
			}
		}
		res = res/coches.size();
		return res;
		
	}
	
	//Coches con mas de x caballos
	public List<String> masDeXCaballos(Integer numCaballos) {
		List<String> res = new ArrayList<String>();
		for(Coche c: coches) {
			if(c.getCaballos()>numCaballos) {
				res.add(c.getConstructor()+" "+c.getModelo());
			}
		}
		return res;
	}
	
	//Map de Constructor como clave y lista de modelos como valor
	public Map<String,Set<String>> ConstructorModelos() {
		Map<String,Set<String>> res = new HashMap<>();
		for(Coche c:coches) {
			String con = c.getConstructor();
			if(!res.containsKey(con)) {
				res.put(con, new HashSet<String>());
			}
			res.get(con).add(c.getModelo());
		}
		return res;
	}
	
	//numero de ventas en miles por constructor
	public Map<String,Integer> numeroVentasConstructor() {
		Map<String,Integer> res = new HashMap<>();
		for(Coche c:coches) {
			String con = c.getConstructor();
			if(!res.containsKey(con)) {
				res.put(con, 0);
			} 
			int v = res.get(con) + c.getVentasMiles();
			res.put(con, v);	
		}
		return res;
	}
	
	
	
	

}
