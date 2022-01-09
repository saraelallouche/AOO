package verison2 ;


public class Calcul{
	
	private float valRight;
	private float ValLeft;
	private String op;

	public Calcul(float valRight, float ValLeft, String op) {
		this.valRight= valRight;
		this.ValLeft= ValLeft;
		this.op= op;
	}
	
	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public float getValRight() {
		return valRight;
	}

	public void setValRight(float valRight) {
		this.valRight = valRight;
	}

	public float getValLeft() {
		return ValLeft;
	}

	public void setValLeft(float valLeft) {
		this.ValLeft = valLeft;
	}

	public  float calculer() {
		if("+".equals(op)) {
			return valRight+ValLeft;
		}
		else if("-".equals(op)) {
			return valRight-ValLeft;
		}
		else if("*".equals(op)) {
			return valRight*ValLeft;
		}
		else if("/".equals(op)) {
			return valRight/ValLeft;
		}
		return 0;
	}
	

}