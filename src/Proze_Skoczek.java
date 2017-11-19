
public class Proze_Skoczek {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		try{
		Obsluga_Plikow OP = new Obsluga_Plikow();
		gui GUI = new gui();
		GUI.zlap_konfiguracje(OP.konfiguracja);
		}
		catch(Exception e){
			System.out.print(e);
			System.out.println("Innymi slowy: musisz dodac plik \"plik_konfiguracyjny.txt\" do folderu programu");
		}

	}

}
