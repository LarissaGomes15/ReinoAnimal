package Reinoanimal;

/**
 * Classe responsavel por gerar um animal terrestre
 * @author 20201064010008
 *
 */
public class Terrestre extends Animal{

	private String regiao;
	private boolean pelo;
	
	/**
	 * metodo que diz que o animal terrestre esta comendo
	 */
	public void comer() {
		System.out.println("O animal  Terrestre está comendo...");
	}
	/**
	 * metodo que diz que o animal aquatico esta se movendo
	 */

	public void mover() {
		System.out.println("O animal está se movendo...");
	}
	
	/**
	 * metodo que mostra o perfil do animal terrestre
	 */
	public void perfil() {
		System.out.println("Tipo de região:" + this.regiao + "pelo:" + this.pelo  + "Especie:" + this.getEspecie() + "sexo:" + this.getSexo() +"Data:" + this.getData());
	}

	/**
	 * getters e setters
	 * @return
	 */
	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public boolean isPelo() {
		return pelo;
	}

	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	
	
	
	
}
