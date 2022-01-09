package verison2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class controlleur {
	
	private String valRight = null;
	private String valLeft = null;
	private String op = null;
	private String text = "";
	public Calcul calcule = new Calcul(0,0, null);
	
	
	@FXML
	private Label texte ;
	
	@FXML
	private Button mult;
	
	@FXML
	private Button egal;
	
	@FXML
	private Button plus;
	
	@FXML
	private Button moins;
	
	@FXML
	private Button div;
	
	@FXML
	private Button un;
	
	@FXML
	private Button deux;
	
	@FXML
	private Button trois;
	
	@FXML
	private Button quatre;
	
	@FXML
	private Button cinq ;
	
	@FXML
	private Button six;
	
	@FXML
	private Button sept;
	
	@FXML
	private Button huit;
	@FXML
	private Button neuf;
	
	@FXML
	private Button zero;
	
	@FXML
	private Button c;
	
	@FXML
	void selectPlus (ActionEvent event) {
		if (text.equals("")) {
			texte.setText("ERROR SAISIR UN NOMBRE D'ABORD (APPUYER SUR C)");
		}
		else {
			calcule.setValRight(Float.parseFloat(text)); 
			calcule.setOp("+");

			text+="+";
			texte.setText(text);
		}
	}
	@FXML
	void selectMoins (ActionEvent event) {
		if (text.equals("")) {
			texte.setText("ERROR SAISIR UN NOMBRE D'ABORD (APPUYER SUR C)");
		}
		else {
			calcule.setValRight(Float.parseFloat(text)); 
			calcule.setOp("-");

			text+="-";
			texte.setText(text);
		}
	}
	
	@FXML
	void selectMult (ActionEvent event) {
		if (text.equals("")) {
			texte.setText("ERROR SAISIR UN NOMBRE D'ABORD (APPUYER SUR C)");
		}
		else {
			calcule.setValRight(Float.parseFloat(text)); 
			calcule.setOp("*");

			text+="x";
			texte.setText(text);
		}
	}
	
	@FXML
	void selectDiv (ActionEvent event) {
		if (text.equals("")) {
			texte.setText("ERROR SAISIR UN NOMBRE D'ABORD (APPUYER SUR C)");
		}
		else {
			calcule.setValRight(Float.parseFloat(text)); 
			calcule.setOp("/");

			text+="/";
			texte.setText(text);
			
		}
	}
	@FXML
	void select1 (ActionEvent event) {
		text+="1";
		texte.setText(text);
	}
	
	@FXML
	void select2 (ActionEvent event) {
		text+="2";
		texte.setText(text);	}
	@FXML
	void select3 (ActionEvent event) {
		text+="3";
		texte.setText(text);	}
	@FXML
	void select4 (ActionEvent event) {
		text+="4";
		texte.setText(text);	}
	
	@FXML
	void select5 (ActionEvent event) {
		text+="5";
		texte.setText(text);	}
	@FXML
	void select6 (ActionEvent event) {
		text+="6";
		texte.setText(text);	}
	@FXML
	void select7 (ActionEvent event) {
		text+="7";
		texte.setText(text);	}
	
	@FXML
	void select8 (ActionEvent event) {
		text+="8";
		texte.setText(text);	}
	@FXML
	void select9 (ActionEvent event) {
		text+="9";
		texte.setText(text);	}
	@FXML
	void select0 (ActionEvent event) {
		text+="0";
		texte.setText(text);	}
	
	
	@FXML
	void selectC (ActionEvent event) {
		texte.setText("");
		text="";

	}
	
	@FXML
	void selectEgal (ActionEvent event) {
		int index = text.indexOf(calcule.getOp());
		valLeft= text.substring(index+1);
		calcule.setValLeft(Float.parseFloat(valLeft));
		text = Float.toString(calcule.calculer());
	//	text = "5";
		texte.setText(text);
		calcule =  new Calcul(0,0,null);

	}
	

}
