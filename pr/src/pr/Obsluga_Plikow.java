package pr;

import java.io.FileReader;

public class Obsluga_Plikow{

	public String konfiguracja;


	Obsluga_Plikow()throws Exception{
		FileReader fr = new FileReader("plik_konfiguracyjny.txt"); 
		int odczyt;
		while((odczyt = fr.read()) != -1){
			konfiguracja += (char) odczyt;		
		}
		
		System.out.print(konfiguracja);
		fr.close();
	}

	// void wczytaj_plik_konf(int i)throws Exception{

	// 	FileReader fr = new FileReader("plik_konfiguracyjny.txt"); 
	// 	int odczyt;
	// 	while((odczyt = fr.read()) != -1){
	// 		konfiguracja += (char) odczyt;		
	// 	}
	// 	System.out.print(konfiguracja);
	// 	fr.close();
	// }
}