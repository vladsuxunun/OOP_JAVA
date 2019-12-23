package res;


public class Resistor extends Circuit {
	private double pottentialDiff;
	double R;
	
	public Resistor(double R) {
		this.R=R;
	}
	
	public Resistor(double R, double pottentialDiff) {
		this.R =R;
		this.pottentialDiff=pottentialDiff;
	}
	
	@Override
	public double getResistance() {
		return R;
	}

	@Override
	public double getPottentialDiff() {
		return pottentialDiff;
	}
	

	@Override
	public void applyPottentialDiff(double V) {
		this.pottentialDiff = V;	
	}
}

