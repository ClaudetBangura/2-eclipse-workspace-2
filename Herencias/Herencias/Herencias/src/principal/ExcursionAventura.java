package principal;

public class ExcursionAventura extends Excursion {

	private Dificultad dificultad;
	
	public ExcursionAventura(String codigo, Destino destino, int numeroParticipantes, double distanciaRecorrida,
			double duracion, Dificultad dificultad) {
		super(codigo, destino, numeroParticipantes, distanciaRecorrida, duracion);
			
		this.dificultad = dificultad;
	
		
	}

	public Dificultad getDificultad() {
		return dificultad;
	}

	public void setDificultad(Dificultad dificultad) {
		this.dificultad = dificultad;
	}

	@Override
	public String toString() {
		return "ExcursionAventura [dificultad=" + dificultad + ", getCodigo()=" + getCodigo() + ", getDestino()="
				+ getDestino() + ", getNumeroParticipantes()=" + getNumeroParticipantes() + ", getDistanciaRecorrida()="
				+ getDistanciaRecorrida() + ", getDuracion()=" + getDuracion() + ", grupoCompleto()=" + grupoCompleto()
				+ ", obtenerVelocidadMedia()=" + obtenerVelocidadMedia() + ", calcularPrecio()=" + calcularPrecio()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	@Override
	public double calcularPrecio()
	{
			
		double precioTotal = super.calcularPrecio();

		if(dificultad == Dificultad.BAJO)
		{
			precioTotal += getNumeroParticipantes();
		}
		
		else if (dificultad == Dificultad.MEDIO)
		{
			precioTotal += getNumeroParticipantes() + 150;
		}
		
		else if (dificultad == Dificultad.EXTREMO)
		{
			precioTotal += getNumeroParticipantes() + 300;
		}
		
		
		
		
		return precioTotal;
		
			
	}
	
	
	

}
