package Reinoanimal;

public class Terrestre extends Animal{

	private String regiao;
	private boolean pelo;
	

	public void comer() {
		System.out.println("O animal  Terrestre está comendo...");
	}
	
	public void mover() {
		System.out.println("O animal está se movendo...");
	}
	
	
	public void perfil() {
		System.out.println("Tipo de região:" + this.regiao + "pelo:" + this.pelo  + "Especie:" + this.getEspecie() + "sexo:" + this.getSexo() +"Data:" + this.getData());
	}

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
