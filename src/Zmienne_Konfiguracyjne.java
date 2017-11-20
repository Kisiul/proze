

public class Zmienne_Konfiguracyjne {
int zmienna_1;
int zmienna_2;
int zmienna_3;
String konfiguracja;

Zmienne_Konfiguracyjne(){
zmienna_3 = 3;
zmienna_2 = 2;
zmienna_1 = 1;
}


public void zapisz_konfiguracje(String k){
	konfiguracja = k;
}

public String czytaj_konfiguracje(){
	return konfiguracja;
}

public int get_zmienna(int i){
	switch(i){
		case 1:
			return zmienna_1;
		case 2:
			return zmienna_2;
		case 3:
			return zmienna_3;

	}
	return 0;
}


}

