package Fundamentos5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona per1=new Persona();
		per1.setNombre("fanny");
		per1.setDireccion("florida Norte");
		per1.setTelefono(2245665);
		per1.setEmail("fanny@hotmal.com");
		System.out.println("NOMBRE DEL ESTUDIANTE: "+ per1.getNombre());
		System.out.println("DIRECCION DEL ESTUDIANTE: "+ per1.getDireccion());
		System.out.println("TELEFONO DEL ESTUDIANTE: "+ per1.getTelefono());
		System.out.println("EMAIL DEL ESTUDIANTE: "+ per1.getEmail());

	}

}
