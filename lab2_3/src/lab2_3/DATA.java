package lab2_3;

public class DATA {
	

private double sum;
private double maxi; 
private int count; 
public DATA() { 
	sum  =0.0;
	maxi= 0.0; 
	count = 0;
}

public  void adddata(double num) 
{ 
	sum += num;
	count++;
	if (maxi < num) 
		maxi = num; 
}
	public double getAverage()
	{
	if (count!=0) {
		
	 return sum/count;
	}
	return 0.0; 
	}
	
	public double getmaximum() 
	{ 
		return maxi; 
	}
	
	
	
};


