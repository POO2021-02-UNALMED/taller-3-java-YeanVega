package taller3.televisores;

public class Control {
	TV tv;

	public void enlazar(TV tv) {
		this.tv = tv;
	}
	
	public void setCanal(int canal) {
		tv.canal = canal;
	}
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void canalUp() {
		if (tv.canal >= 1 && tv.canal <=120) {
			tv.canal++;
		}
	}
	
	public void canalDown() {
		if (tv.canal >= 1 && tv.canal <=120) {
			tv.canal--;
		}
	}
	
	public void volumenUp() {
		if (tv.volumen >= 1 && tv.volumen <=7) {
			tv.volumen++;
		}
	}
	
	public void volumenDown() {
		if (tv.volumen >= 1 && tv.volumen <=7) {
			tv.volumen--;
		}
	}
	
	
	
	public TV getTv() {
		return tv;
	}

	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	
}