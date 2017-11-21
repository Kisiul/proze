package pr;


import javax.swing.*;
import java.awt.event.*;  

public class gui extends JFrame implements Skoczek{

	/**
	 * @param args
	 */
	 
	 JFrame main_menu = new JFrame("menu glowne");
	 String wczytano = "konfiguracja";
	 gui(){														//konstruktor	 

	 }

	 public void ekran_startowy(){

	 JButton b_nowa_gra = new JButton("nowa gra");				// tworzenie przyciskow
	 JButton b_wczytaj_plik = new JButton("wczytaj plik");
	 JButton b_wyjscie = new JButton("wyjscie");
	 JFrame b_plansza = new JFrame("plasza");
	 
	 b_nowa_gra.setBounds(130, 20, 100, 40);					//ustawienie polozenia i wymiarow przyciskow
	 b_wczytaj_plik.setBounds(130, 70, 100, 40);
	 b_wyjscie.setBounds(130, 300, 100, 30);
	 b_plansza.setBounds(20, 20, 200, 200);
	 
	 JTextField tf=new JTextField();							//utworzenie i dodanie pola tekstowego
	 tf.setBounds(50,160, 210, 100); 
	 
	 add(b_nowa_gra);	//dodanie przyciskow
	 add(b_wczytaj_plik);
	 add(b_wyjscie);
	 
	 
	 	b_nowa_gra.addActionListener(new ActionListener(){  	//wypisanie wczytnago pliku do pola tekstowego po wczisnieciu "wczytaj plik"
		public void actionPerformed(ActionEvent e){  
         tf.setText("wczytywanie planszy"); 
        // b_nowa_gra.setVisible(false);
     		}  
 		}); 
	 
	     b_wyjscie.addActionListener(new ActionListener(){  	//ustawienie akcji System.exit(0) do przycisku "wyjscie"
		public void actionPerformed(ActionEvent e){  
            System.exit(0);  
        		}  
    		});  
	 
 
 
	 
	 
	 	b_wczytaj_plik.addActionListener(new ActionListener(){  	//wypisanie wczytnago pliku do pola tekstowego po wczisnieciu "wczytaj plik"
		public void actionPerformed(ActionEvent e){  
            tf.setText(wczytano); 
        		}  
    		}); 
	 
	 JLabel l_wczytany_plik = new JLabel("wczytany plik:");		//utworzenie i dodanie etykiety "wczytany plik:"
	 l_wczytany_plik.setBounds(50, 120, 150, 40);
	 add(l_wczytany_plik);
	 add(tf);
	 setSize(400,500);  										//ustawienia okna
	 setLayout(null);  
	 setVisible(true);  
	 }

	public void zlap_konfiguracje(String konf){
	wczytano = konf;
	}

	void wczytaj_plik_konf(int i){


	}

}