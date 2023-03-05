package fp.coches;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import fp.utiles.Checkers;
public class Coche {
	private String constructor;
	private String modelo;
	private Integer ventasMiles;
	private Double reventaValor;
	private Boolean esPasajeros;
	private Double precioMiles;
	private Double tamanoMotor;
	private Integer caballos;
	private Double distanciaEjes;
	private Double ancho;
	private Double largo;
	private Double peso;
	private Double capacidadGasolina;
	private Integer eficienciaGasolina;
	private LocalDate ultimoLanzamiento;
	private List<Colores> colores;
	
	//Getters & Setters
	public Integer getVentasMiles() {
		return ventasMiles;
	}
	public void setVentasMiles(Integer ventasMiles) {
		this.ventasMiles = ventasMiles;
	}
	public Double getReventaValor() {
		return reventaValor;
	}
	public void setReventaValor(Double reventaValor) {
		this.reventaValor = reventaValor;
	}
	public Double getPrecioMiles() {
		return precioMiles;
	}
	public void setPrecioMiles(Double precioMiles) {
		this.precioMiles = precioMiles;
	}
	public Double getTamanoMotor() {
		return tamanoMotor;
	}
	public void setTamanoMotor(Double tamanoMotor) {
		this.tamanoMotor = tamanoMotor;
	}
	public Integer getCaballos() {
		return caballos;
	}
	public void setCaballos(Integer caballos) {
		this.caballos = caballos;
	}
	public Double getDistanciaEjes() {
		return distanciaEjes;
	}
	public void setDistanciaEjes(Double distanciaEjes) {
		this.distanciaEjes = distanciaEjes;
	}
	public Double getAncho() {
		return ancho;
	}
	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}
	public Double getLargo() {
		return largo;
	}
	public void setLargo(Double largo) {
		this.largo = largo;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getCapacidadGasolina() {
		return capacidadGasolina;
	}
	public void setCapacidadGasolina(Double capacidadGasolina) {
		this.capacidadGasolina = capacidadGasolina;
	}
	public Integer getEficienciaGasloina() {
		return eficienciaGasolina;
	}
	public void setEficienciaGasloina(Integer eficienciaGasloina) {
		this.eficienciaGasolina = eficienciaGasloina;
	}
	public LocalDate getUltimoLanzamiento() {
		return ultimoLanzamiento;
	}
	public void setUltimoLanzamiento(LocalDate ultimoLanzamiento) {
		this.ultimoLanzamiento = ultimoLanzamiento;
	}
	public List<Colores> getColores() {
		return colores;
	}
	public void setColores(List<Colores> colores) {
		this.colores = colores;
	}
	public String getConstructor() {
		return constructor;
	}
	public String getModelo() {
		return modelo;
	}
	public Boolean getEsPasajeros() {
		return esPasajeros;
	}
	
	
	//Constructor 1
	public Coche(String constructor, String modelo, Integer ventasMiles, Double reventaValor, Boolean esPasajeros,
			Double precioMiles, Double tamanoMotor, Integer caballos, Double distanciaEjes, Double ancho, Double largo,
			Double peso, Double capacidadGasolina, Integer eficienciaGasolina, LocalDate ultimoLanzamiento,
			List<Colores> colores) {
		//Restricciones:
		super();
		Checkers.checkNoNull(constructor);
		Checkers.checkNoNull(modelo);
		Checkers.check("Una reventa no puede ser mayor a su precio origen", reventaValor<100);
		Checkers.check("Un vehiculo no puede tener coste menor a 0", precioMiles>=0);
		Checkers.check("No puede haber ventas negativas", ventasMiles>0);
		Checkers.check("Las dimensiones del motor no cumplen las normativas", tamanoMotor>=1 && tamanoMotor<6);
		Checkers.check("La fecha de lanzamiento tiene que ser anterior a la fecha de hoy", ultimoLanzamiento.isBefore(LocalDate.now()));
		this.constructor = constructor;
		this.modelo = modelo;
		this.ventasMiles = ventasMiles;
		this.reventaValor = reventaValor;
		this.esPasajeros = esPasajeros;
		this.precioMiles = precioMiles;
		this.tamanoMotor = tamanoMotor;
		this.caballos = caballos;
		this.distanciaEjes = distanciaEjes;
		this.ancho = ancho;
		this.largo = largo;
		this.peso = peso;
		this.capacidadGasolina = capacidadGasolina;
		this.eficienciaGasolina = eficienciaGasolina;
		this.ultimoLanzamiento = ultimoLanzamiento;
		this.colores = colores;
	}
	
	//Constructor 2 (Sin ventasMiles, reventaValor, 
	public Coche(String constructor, String modelo, Boolean esPasajeros, Double tamanoMotor, Integer caballos,
			Double distanciaEjes, Double capacidadGasolina, Integer eficienciaGasolina) {
		super();
		Checkers.checkNoNull(constructor);
		Checkers.checkNoNull(modelo);
		this.constructor = constructor;
		this.modelo = modelo;
		ventasMiles = null;
		reventaValor = null;
		this.esPasajeros = esPasajeros;
		precioMiles = null;
		this.tamanoMotor = tamanoMotor;
		this.caballos = caballos;
		this.distanciaEjes = distanciaEjes;
		ancho = null;
		largo = null;
		peso = null;
		this.capacidadGasolina = capacidadGasolina;
		this.eficienciaGasolina = eficienciaGasolina;
		ultimoLanzamiento = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth()-1); //Dia de ayer
		colores = List.of(Colores.NEGRO, Colores.BLANCO); //Colores monocromaticos
		
	}
	
	
	//HashCode e equals:
	@Override
	public int hashCode() {
		return Objects.hash(ancho, caballos, capacidadGasolina, colores, constructor, distanciaEjes, eficienciaGasolina,
				esPasajeros, largo, modelo, peso, precioMiles, reventaValor, tamanoMotor, ultimoLanzamiento, ventasMiles);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(ancho, other.ancho) && Objects.equals(caballos, other.caballos)
				&& Objects.equals(capacidadGasolina, other.capacidadGasolina) && Objects.equals(colores, other.colores)
				&& Objects.equals(constructor, other.constructor) && Objects.equals(distanciaEjes, other.distanciaEjes)
				&& Objects.equals(eficienciaGasolina, other.eficienciaGasolina)
				&& Objects.equals(esPasajeros, other.esPasajeros) && Objects.equals(largo, other.largo)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(peso, other.peso)
				&& Objects.equals(precioMiles, other.precioMiles) && Objects.equals(reventaValor, other.reventaValor)
				&& Objects.equals(tamanoMotor, other.tamanoMotor)
				&& Objects.equals(ultimoLanzamiento, other.ultimoLanzamiento)
				&& Objects.equals(ventasMiles, other.ventasMiles);
	}
	
	//CompareTO
	public int compareTo(Coche c) {
		int r;
		if (c == null) {
			throw new NullPointerException();
		}
		r = constructor.compareTo(c.getConstructor());	
		if (r == 0) {
			r = modelo.compareTo(c.getModelo());
		}
		return r;	
	}
	
	//ToString
	@Override
	public String toString() {
		return "Coche [constructor=" + constructor + ", modelo=" + modelo + ", ventasMiles=" + ventasMiles
				+ ", reventaValor=" + reventaValor + ", esCoche=" + esPasajeros + ", precioMiles=" + precioMiles
				+ ", tamanoMotor=" + tamanoMotor + ", caballos=" + caballos + ", distanciaEjes=" + distanciaEjes
				+ ", ancho=" + ancho + ", largo=" + largo + ", peso=" + peso + ", capacidadGasolina="
				+ capacidadGasolina + ", eficienciaGasloina=" + eficienciaGasolina + ", ultimoLanzamiento="
				+ ultimoLanzamiento + ", colores=" + colores + "]";
	}
	
	//Propiedades derivadas
	public String pasajerosOComercial(Boolean b) {
		if (b) {
			return "vehiculo de pasajeros";
		} else {
			return "vehiculo de comercial";
		}
	}
	public String mesesEsp(Integer n) {
		String s = null;
		switch(n) {
		case 1:
			s = "Enero";
			break;
		case 2:
			s = "Febrero";
			break;
		case 3:
			s = "Marzo";
			break;
		case 4:
			s = "Abril";
			break;
		case 5:
			s = "Mayo";
			break;
		case 6:
			s = "Junio";
			break;
		case 7:
			s = "Julio";
			break;
		case 8:
			s = "Agosto";
			break;
		case 9:
			s = "Septiembre";
			break;
		case 10:
			s = "Octubre";
			break;
		case 11:
			s = "Noviembre";
			break;
		case 12:
			s = "Diciembre";
			}
		return s;
	}
	
	public String descripcionEnPortalDeVenta() {
		return "El vehiculo " + constructor + " " + modelo + " es un " + pasajerosOComercial(esPasajeros)
		+ " tasado en " + precioMiles + " miles de euros, lanzado el " + ultimoLanzamiento.getDayOfMonth() + " de " + 
				mesesEsp(ultimoLanzamiento.getMonthValue()) + " del " + ultimoLanzamiento.getYear() + 
				". Su tamaño de motor es de " + tamanoMotor + " cc con " + caballos
		+ " caballos de potencia, su distancia entre ejes es de " + distanciaEjes + " cm, sus dimensiones son " + ancho
		+ "x" + largo + " cm, con un peso de " + peso + " toneladas. Su deposito tiene una capacidad de " + capacidadGasolina
		+ " litros cuya eficiencia es de " + eficienciaGasolina + ". Los colores del coche son: " + colores.toString() + ".";
	}	

}
