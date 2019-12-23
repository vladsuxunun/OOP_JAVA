package res;




public abstract class Circuit {
	public abstract double getResistance();
	public abstract double getPottentialDiff();
	public abstract void applyPottentialDiff(double V);
	public double getPower() {
		return getCurrent() * getPottentialDiff();
	}
	
	public double getCurrent() {
		return getPottentialDiff()/getResistance();
	}
	
	public String toString() {
		return   " " + getResistance() +" " + getPottentialDiff() + " "+ getCurrent() + " " + getPower();
	}
}
