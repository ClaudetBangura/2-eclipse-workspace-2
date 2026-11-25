package principal;

public class Personaje {
	
	private String nombre;
	private int nivel;
	private int puntosVida;
	
	
	public Personaje()
	{
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}


	public int getPuntosVida() {
		return puntosVida;
	}


	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	
	public void presentarse()
	{
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Nivel: " + this.nivel);
		System.out.println("Puntos de vida: " + this.puntosVida);
	}
	
	public void play()
	{
		
	}
	
	public int recibirDanio(int cantidad)
	{
		return puntosVida - cantidad;
	}

}
