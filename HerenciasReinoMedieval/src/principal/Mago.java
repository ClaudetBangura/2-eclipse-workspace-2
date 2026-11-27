package principal;

public class Mago extends Personaje {

	private int hechizos;
	private Ataque ataque;
	
	
	public Mago(String nombre, int nivel, int puntosVida, int hechizos, Ataque ataque) {
		
		super(nombre, nivel, puntosVida);
		this.hechizos = hechizos;
		this.ataque = ataque;
	}
	
	


	public int getHechizos() {
		return hechizos;
	}



	public void setHechizos(int hechizos) {
		this.hechizos = hechizos;
	}


	public int meditar(int cantidad)
	{
		return hechizos += cantidad;
	}
	
	@Override
	public void play()
	{
		if(hechizos > 0)
		{
			hechizos--;
			System.out.println("Ataque magico: " + ataque);
		}
		
		else
		{
			System.out.println("No te quedan hechizos. Tienes que meditar para recuperar hechizos");
		}
	}
	
	@Override
	public void recibirDanio(int cantidad)
	{
		super.presentarse();
		System.out.println("Hechizos:" + hechizos);
		System.out.println("Ataque:" + ataque);
	}
	
	

}
