package res;


public class Parallel extends Circuit{
	Circuit c1,c2;
	public Parallel(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2=c2;
	}

	@Override
	public double getResistance() {
		return c1.getResistance() *c2.getResistance()/(c1.getResistance()+c2.getResistance());
	}

	@Override
	public double getPottentialDiff() {
		return c1.getPottentialDiff();
	}

	@Override
	public void applyPottentialDiff(double V) {
		c1.applyPottentialDiff(V);
		c2.applyPottentialDiff(V);
		
	}
}
