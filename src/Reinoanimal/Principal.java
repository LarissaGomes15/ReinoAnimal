package Reinoanimal;

public class Principal {
	
	public static void main(String[] args) {
		
		Terrestre a1 = new Terrestre();
		a1.setEspecie("Felis catus");
		a1.setData("2");
		a1.setSexo("Femêa");
		a1.setPelo(true);
		a1.setRegiao("ásia");
		a1.perfil();
		a1.comer();
		
		Aquatico a2 = new Aquatico();
		a2.setEspecie("Carcharias taurus");
		a2.setData("7");
		a2.setSexo("Fêmea");
		a2.setEscama(true);
		a2.setTipoagua("salgada");
		a2.perfil();
		a2.comer();
		
		Aereo a3 = new Aereo();
		a3.setEspecie("Carcharias taurus");
		a3.setData("7");
		a3.setSexo("Fêmea");
		a3.setAltitude("54.3");
		a3.perfil();
		a3.comer();
		
		
		
	}


	
}
