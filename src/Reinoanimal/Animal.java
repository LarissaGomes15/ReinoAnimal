package Reinoanimal;

/**
 * Essa classe e responsavel por gerar um animal
 * @author 20201064010008
 *
 */

public class Animal {
	
	private String especie;
	private String sexo;
	private String data;
	private static int contador;
	
	/**
	 * Este metodo é responsável por contar a quantidade de animais cadastrados 
	 */
	public Animal() {
		setContador();
	}
	
	/**
	 * metodo que diz que o animal esta comendo
	 */
	public void comer() {
		System.out.println("O animal está comendo...");
	}
	
	/**
	 * metodo que vai exibir o perfil do animal,como: especie,sexo e data
	 */
	public void perfil() {
		System.out.println("Especie:" + this.especie + "sexo:" + this.sexo +"Data:" + this.data);
	}
	
	/**
	 * getters e setters
	 * @return
	 */
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public static int getContador() {
		return contador;
	}
	private static void setContador() {
		Animal.contador = Animal.contador + 1;
	}
	
}
