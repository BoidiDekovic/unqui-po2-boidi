package ar.edu.unq.poo2.practica5;

import java.time.LocalDate;

public class Servicio extends Factura {
	
	private Double costoPorUnidad;
	private Integer cantidadDeUnidades;
	private LocalDate fehaFacturado;


	public Servicio(Double costoPorUnidad, Integer cantidadDeUnidades, LocalDate fehaFacturado) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidades = cantidadDeUnidades;
		this.fehaFacturado = fehaFacturado;
	}

	@Override
	public void registrarPago() {
		this.agencia.registrarPago(this);
		
	}

	@Override
	public Double getPrecio() {
		return this.costoPorUnidad*this.cantidadDeUnidades;
		}
		

}
