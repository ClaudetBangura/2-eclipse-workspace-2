package principal;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExcursionCultural excursioncultural = new ExcursionCultural("1", Destino.CIUDAD, 25, 150,10,true);
		
		System.out.println(excursioncultural.toString());
		System.out.println(excursioncultural.calcularPrecio());
		
		ExcursionBuceo excursionBuceoSinEquipo = new ExcursionBuceo("2", Destino.PLAYA, 10, 100, 1, false, 6, false);
		
		System.out.println(excursionBuceoSinEquipo.toString());
	}

}
