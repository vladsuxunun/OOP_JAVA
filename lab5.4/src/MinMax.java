
	public class MinMax {
		static int min;
        static int max;
        int  getMin()
        {
        	return min;
        }
        int  getMax()
        {
        	return max;
        }
		static class Comparison {
        
        
			public int[]  com(int values[])
			{
				int [] arr= {0,0};
				for(int i = 0;i < values.length;i++)
				{
					
					if(arr[0] < values[i])
					{
						arr[0] = values[i];
					}
			}
				for(int i = 0;i < values.length;i++)
				{
					
					if(arr[1] > values[i])
					{
						arr[1] = values[i];
					}
			}
				return arr;
				
			}
		}
		static void minmax(int values[]){
			max = values[0];
			min = values[1];
			
		}
}
