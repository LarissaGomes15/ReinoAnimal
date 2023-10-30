package Reinoanimal;

public class Aereo extends Animal {
	private String altitude;
	
	public void comer() {
		System.out.println("O animal  aereo  está comendo...");
	}
	
	public void voar() {
		System.out.println("O animal está voando...");
	}
	
	
	public void perfil() {
		System.out.println("Altitude" + this.altitude + "Especie:" + this.getEspecie() + "sexo:" + this.getSexo() +"Data:" + this.getData());
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
	
}
