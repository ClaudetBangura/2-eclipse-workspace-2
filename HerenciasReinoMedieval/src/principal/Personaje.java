package principal;

public class Personaje {
	
	private String nombre;
	private int nivel;
	private int puntosVida;
	
	
	public Personaje(String nombre, int nivel, int puntosVida)
	{
		super();
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
		System.out.println("Nombre: " + nombre);
		System.out.println("Nivel: " + nivel);
		System.out.println("Puntos de vida: " + puntosVida);
	}
	
	public void play()
	{
		
	}
	
	public void recibirDanio(int cantidad)
	{
		setPuntosVida(puntosVida - cantidad);
	}

}
