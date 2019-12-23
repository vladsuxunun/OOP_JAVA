package lab4_1;
import java.io.*;
import java.util.regex.Pattern;
public class ReadStream {
	public void sinz()
	{
	try (FileInputStream fis = new FileInputStream("scores.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {

           String line;
           String lol ="";
           int cnt = 0;
            int arr[] = new int[100];
            int arr1[] = new int[1000];
            int cnt1 = 0;
           while ((line  = reader.readLine()) != null) {
              lol +=line + " ";
              
           }
          
           //for(int i = 0;i < cnt - 1;i++)
           String ff[] = lol.split(" ");
        int cnt2 = 0;
        	   for(int i = 2;i < ff.length;i +=3) {
        	   arr1[cnt++] = Integer.valueOf(ff[i]);
        	   //System.out.print(arr1[1]);
         // int a = Integer.decode(ff[i]);
        	   
          
        	   }
        
        	   for(int i = 0; i < ff.length;i++)
        	   {
        		  cnt1++;
        		   if(cnt1 % 3 == 1)
        		   {
        	 System.out.print(ff[i] + " " );
        		   }
        		   if(cnt1 % 3 == 2)
        		   {
        		   System.out.println(ff[i] +" " + arr1[cnt2++]);
        		   }
        	   }
        	   
       } catch (FileNotFoundException e1) {
           System.out.println("Файл не найден!");
       } catch (IOException e) {
           e.printStackTrace();
       }
	
}
}

