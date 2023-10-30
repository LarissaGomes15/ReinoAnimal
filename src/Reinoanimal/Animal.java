package Reinoanimal;

public class Animal {

	private String especie;
	private String sexo;
	private String data;
	private static int contador;
	
	public Animal() {
		setContador();
	}
	
	public void comer() {
		System.out.println("O animal está comendo...");
	}
	
	public void perfil() {
		System.out.println("Especie:" + this.especie + "sexo:" + this.sexo +"Data:" + this.data);
	}
	
	
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
