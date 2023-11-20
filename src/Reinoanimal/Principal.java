package Reinoanimal;
/**
 * Classe responsavel por fazer os testes
 * @author 20201064010008
 *
 */
public class Principal {

	public static void main(String[] args) {

		/**
		 * instancias de objetos
		 */
		
		Terrestre a1 = new Terrestre();
		a1.setEspecie("Felis catus");
		a1.setData("2");
		a1.setSexo("Femea");
		a1.setPelo(true);
		a1.setRegiao("asia");
		a1.perfil();
		a1.comer();
		a1.mover();

		Aquatico a2 = new Aquatico();
		a2.setEspecie("Carcharias taurus");
		a2.setData("7");
		a2.setSexo("Femea");
		a2.setEscama(true);
		a2.setTipoagua("salgada");
		a2.perfil();
		a2.comer();
		a2.nadar();

		Aereo a3 = new Aereo();
		a3.setEspecie("Caragyps taurus");
		a3.setData("3");
		a3.setSexo("Macho");
		a3.setAltitude("54.5");
		a3.perfil();
		a3.comer();
		a3.voar();

		Aereo a4 = new Aereo();
		a4.setEspecie("Amazonas aestiva");
		a4.setData("10");
		a4.setSexo("Femea");
		a4.setAltitude("37.9");
		a4.perfil();
		a4.comer();
		a4.voar();

		Aquatico a5 = new Aquatico();
		a5.setEspecie("Pygocentrus nattereri");
		a5.setData("3");
		a5.setSexo("Macho");
		a5.setEscama(true);
		a5.setTipoagua("agua doce");
		a5.perfil();
		a5.comer();
		a5.nadar();
		
	
		
	
		Terrestre a6 = new Terrestre();
		a6.setEspecie("Hydrochoerus hydrochaeris");
		a6.setData("8");
		a6.setSexo("Macho");
		a6.setPelo(true);
		a6.setRegiao("America do sul");
		a6.perfil();
		a6.comer();
		a6.mover();
		
		/**
		 * sera exibido a quantidade de animais cadastrados
		 */
		System.out.println("Animais cadastrados:" + Animal.getContador());
	

	}

}
