package version1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Interaction extends Calculatrice {
	
	Calcul calcul = new Calcul(0, 0, null) ;
	public Scanner s;
	public OutputStream o;
	public Properties properties;
	
	public Interaction (Scanner s,  OutputStream o, Properties properties) {
		this.s=s;
		this.o=o;
		this.properties=properties;
	}
	
	
	public Calcul saisie() throws FileNotFoundException, IOException {
		 System.out.println("enter a language (fr, en)");
		 String langue= s.next();
		 String url= "src/"+langue+ ".properties";
		 this.properties.load(new FileInputStream(url));
		 Set<String> myOrderedSet = new LinkedHashSet(properties.stringPropertyNames());
		for(String key : myOrderedSet) {
			
			  String value = properties.getProperty(key);
			 
			  System.out.println(value);
			  String rep = s.next();
			  
			  if("Fq2".equals(key)) {
				  calcul.setValRight(Float.parseFloat(rep));
			  }
			  else if ("Fq4".equals(key)) {
				  calcul.setValLeft(Float.parseFloat(rep));
			  }
			  else if ("Fq1".equals(key)) {
				  calcul.setOp(rep);
			  }
		}	
		return calcul;
	}
	
	
	public void affichage() {
		
		String valLeft = Float.toString(calcul.getValLeft());
		String valRight= Float.toString(calcul.getValRight());
		String op= calcul.getOp();
/*		String q1 = null;
		String q2 = null;
		for(String key : properties.stringPropertyNames()) {
			  if (key.equals("Fq77")) {
				  q1= properties.getProperty(key);
			  }
			  else if (key.equals("Fq99")) {
				  q2= properties.getProperty(key);
			  }
		}
	*/	
		System.out.println(valRight + op+ valLeft+ " = "+ calcul.calculer());
	}
}
