package pr;

public class Proze_Skoczek {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		try{
		Obsluga_Plikow OP = new Obsluga_Plikow();
		Zmienne_Konfiguracyjne ZMK = new Zmienne_Konfiguracyjne();
		Skoczek GUI = new gui();
		//PropertiesTest pt = new PropertiesTest();
		
		ZMK.zapisz_konfiguracje(OP.konfiguracja);
		GUI.zlap_konfiguracje(ZMK.czytaj_konfiguracje());
		GUI.ekran_startowy();
		//pt.getProperties();
		
		
		}
		catch(Exception e){
			System.out.print(e);
			//System.out.println("Innymi slowy: musisz dodac plik \"plik_konfiguracyjny.txt\" do folderu programu");
		}

	}

}
