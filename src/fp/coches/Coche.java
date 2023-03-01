package fp.coches;

import java.time.LocalDate;

public class Coche {
	private String constructor;
	private String modelo;
	private Integer ventasMiles;
	private Double reventaValor;
	private TipoVehiculo tipoVehiculo;
	private Double precioMiles;
	private Double tamanoMotor;
	private Integer caballos;
	private Double distanciaEjes;
	private Double ancho;
	private Double largo;
	private Double peso;
	private Double capacidadGasolina;
	private Integer eficienciaGasloina;
	private LocalDate ultimoLanzamiento;
	private Colores color1;
	private Colores color2;
	private Colores color3;
	private Colores color4;
	private Colores color5;
	
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
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
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
		return eficienciaGasloina;
	}
	public void setEficienciaGasloina(Integer eficienciaGasloina) {
		this.eficienciaGasloina = eficienciaGasloina;
	}
	public LocalDate getUltimoLanzamiento() {
		return ultimoLanzamiento;
	}
	public void setUltimoLanzamiento(LocalDate ultimoLanzamiento) {
		this.ultimoLanzamiento = ultimoLanzamiento;
	}
	public Colores getColor1() {
		return color1;
	}
	public void setColor1(Colores color1) {
		this.color1 = color1;
	}
	public Colores getColor2() {
		return color2;
	}
	public void setColor2(Colores color2) {
		this.color2 = color2;
	}
	public Colores getColor3() {
		return color3;
	}
	public void setColor3(Colores color3) {
		this.color3 = color3;
	}
	public Colores getColor4() {
		return color4;
	}
	public void setColor4(Colores color4) {
		this.color4 = color4;
	}
	public Colores getColor5() {
		return color5;
	}
	public void setColor5(Colores color5) {
		this.color5 = color5;
	}
	public String getConstructor() {
		return constructor;
	}
	public String getModelo() {
		return modelo;
	}
	
	
	//Constructor 1
	public Coche(String constructor, String modelo, Integer ventasMiles, Double reventaValor, TipoVehiculo tipoVehiculo,
			Double precioMiles, Double tamanoMotor, Integer caballos, Double distanciaEjes, Double ancho, Double largo,
			Double peso, Double capacidadGasolina, Integer eficienciaGasloina, LocalDate ultimoLanzamiento,
			Colores color1, Colores color2, Colores color3, Colores color4, Colores color5) {
		super();
		this.constructor = constructor;
		this.modelo = modelo;
		this.ventasMiles = ventasMiles;
		this.reventaValor = reventaValor;
		this.tipoVehiculo = tipoVehiculo;
		this.precioMiles = precioMiles;
		this.tamanoMotor = tamanoMotor;
		this.caballos = caballos;
		this.distanciaEjes = distanciaEjes;
		this.ancho = ancho;
		this.largo = largo;
		this.peso = peso;
		this.capacidadGasolina = capacidadGasolina;
		this.eficienciaGasloina = eficienciaGasloina;
		this.ultimoLanzamiento = ultimoLanzamiento;
		this.color1 = color1;
		this.color2 = color2;
		this.color3 = color3;
		this.color4 = color4;
		this.color5 = color5;
	}
	
	
	
	
	
	
	
	
	
	

}
