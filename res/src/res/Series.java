package res;

	

public class Series extends Circuit {
	Circuit c1,c2;
	public Series(Circuit c1, Circuit c2) {
		this.c1=c1;
		this.c2=c2;
	}
	
	@Override
	public double getResistance() {
		return c1.getResistance()+c2.getResistance();
	}
	@Override
	public double getPottentialDiff() {
		return c1.getPottentialDiff() + c2.getPottentialDiff();
	}
	
	@Override
	public void applyPottentialDiff(double v) {
		c1.applyPottentialDiff(v*(c1.getResistance()/getResistance()));
		c2.applyPottentialDiff(v*(c2.getResistance()/getResistance()));
	}
}
