package principal;

public class ExcursionBuceo extends Excursion {

	
	private boolean certificado;
	private int profundidad;
	private boolean alquilerEquipo;
	private final double PRECIO = 100; 
	
	public ExcursionBuceo(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, boolean certificado, int profundidad, boolean alquilerEquipo) {
		
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
		this.certificado = certificado;
		this.profundidad = profundidad;
		this.alquilerEquipo = alquilerEquipo;
	}
	
	

	public boolean isCertificado() {
		return certificado;
	}



	public void setCertificado(boolean certificado) {
		this.certificado = certificado;
	}



	public int getProfundidad() {
		return profundidad;
	}

	

	public boolean isAlquilerEquipo() {
		return alquilerEquipo;
	}



	public void setAlquilerEquipo(boolean alquilerEquipo) {
		this.alquilerEquipo = alquilerEquipo;
	}



	@Override
	public String toString() {
		return super.toString() + "\nExcursionBuceo [certificado=" + certificado + ", profundidad=" + profundidad + ", alquilerEquipo="
				+ alquilerEquipo + "]";
	}
	
	@Override
	public double calcularPrecio() 
	{
	    double precioTotal = super.calcularPrecio();
	    
	    if (isAlquilerEquipo()) 
	    {
	        precioTotal += PRECIO * getNumeroParticipantes();
	    }
	    
	    return precioTotal;
	}
	


	

}
