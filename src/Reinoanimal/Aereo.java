package Reinoanimal;

/**
 * Classe responsavel por gerar um animal aereo
 * @author 20201064010008
 *
 */
public class Aereo extends Animal {
	private String altitude;
	
	/**
	 * metodo que diz que o animal areo esta comendo
	 */
	public void comer() {
		System.out.println("O animal  aereo  está comendo...");
	}
	
	/**
	 * metodo que diz que o animal aquatico esta voando
	 */

	public void voar() {
		System.out.println("O animal está voando...");
	}
	
	/**
	 * metodo que mostra o perfil do animal aereo
	 */
	public void perfil() {
		System.out.println("Altitude" + this.altitude + "Especie:" + this.getEspecie() + "sexo:" + this.getSexo() +"Data:" + this.getData());
	}
	
	/**
	 * getters e setters
	 * @return
	 */

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	
	
}
