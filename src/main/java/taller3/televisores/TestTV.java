package taller3.televisores;

public class TestTV {
	public static void main(String[] args) {
		
		Marca marca =  new Marca("Semsung");
		TV tv1 =  new TV(marca, false);
		
		tv1.turnOff();
		
	    System.out.println(tv1.getEstado());

	}
}