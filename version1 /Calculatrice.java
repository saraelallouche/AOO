package version1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Calculatrice  {
	
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner sc = new Scanner(System.in);
		OutputStream o = null;
		Properties p = new Properties();
		Interaction inter = new Interaction(sc, o, p);
		inter.saisie().calculer();
		inter.affichage();
		
		}
	
	
	
}