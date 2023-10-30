package Reinoanimal;

public class Aquatico extends Animal{

	private String tipoagua;
	private boolean escama;
	
	public void comer() {
		System.out.println("O animal  aquatico está comendo...");
	}
	
	public void nadar() {
		System.out.println("O animal está nadando...");
	}
	
	
	public void perfil() {
		System.out.println("Tipo da água:" + this.tipoagua + "escama:" + this.escama  + "Especie:" + this.getEspecie() + "sexo:" + this.getSexo() +"Data:" + this.getData());
	}
	
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
