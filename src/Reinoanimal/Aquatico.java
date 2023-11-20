package Reinoanimal;

/**
 * Classe responsável por gerar um animal aquatico
 * @author 20201064010008
 *
 */
public class Aquatico extends Animal{

	private String tipoagua;
	private boolean escama;
	
	/**
	 * metodo que diz que o animal aquatico esta comendo
	 */
	public void comer() {
		System.out.println("O animal  aquatico está comendo...");
	}
	
	/**
	 * metodo que diz que o animal aquatico esta nadando
	 */
	public void nadar() {
		System.out.println("O animal está nadando...");
	}
	

	/**
	 * metodo que mostra o perfil do animal aquatico
	 */
	public void perfil() {
		System.out.println("Tipo da água:" + this.tipoagua + "escama:" + this.escama  + "Especie:" + this.getEspecie() + "sexo:" + this.getSexo() +"Data:" + this.getData());
	}
	
	/**
	 * getters e setters
	 * @return
	 */
	public String getTipoagua() {
		return tipoagua;
	}
	public void setTipoagua(String tipoagua) {
		this.tipoagua = tipoagua;
	}
	public boolean isEscama() {
		return escama;
	}
	public void setEscama(boolean escama) {
		this.escama = escama;
	}
	
	
	
}
