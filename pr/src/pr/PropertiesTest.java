package pr;

import java.awt.Color;
import java.awt.Graphics;

//import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class PropertiesTest {
	private static int liczba_przeszkod;
	private static int[] x;
	private static int[] y;
	private static int[] dl;
	
    //Plik z konfiguracj¹
    private File f = new File("conf.properties");
    //przysz³y obiekt Properties
    private static Properties properties = new Properties();
 
    public static void main(String[] args) {
        System.setProperty("file.encoding", "UTF-8");
        PropertiesTest pt = new PropertiesTest();
        pt.loadProperties();
        liczba_przeszkod = Integer.parseInt(properties.getProperty("liczba_przeszkod"));
        x = new int[liczba_przeszkod];
        y = new int[liczba_przeszkod];
        dl = new int[liczba_przeszkod];
        for (int i=0; i<liczba_przeszkod; i++)
        {
        	String ii = String.valueOf(i+1);
        	x[i] = Integer.parseInt(properties.getProperty("x".concat(ii)));
        	y[i] = Integer.parseInt(properties.getProperty("y".concat(ii)));
        	dl[i] = Integer.parseInt(properties.getProperty("dl".concat(ii)));
        }
        System.out.println("x[0]: "+x[0]+"  y[0]: "+y[0]+"  dl[0]: "+dl[0]);
        
    
        
    }
    
    public void loadProperties(){
        //Strumieñ wejœciowy
        InputStream is;
        try {
            is = new FileInputStream(f);
            //³adujemy nasze ustawienia
            properties.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public int getX()
{
	return x;
}
}