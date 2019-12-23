package lab4_1;
import java.io.*;
public class WriteStream {

public void outsss()
{
	int arr[] = {1,2};
	try (FileOutputStream fos = new FileOutputStream("scores.txt");
            PrintWriter writer = new PrintWriter(fos,true)) {

           writer.println("Ivanov Ivan " + 100);
           writer.println("Aliyev Ali " + 22);
          
           writer.println("Menshikov Sergey " + 65);
           writer.println("Ivanov Ivan " + 67);
           writer.println("Aliyevgjkj Alhi " + 23);
          
           writer.println("Menshikov Sergeyhh " + 55);




         

       } catch (FileNotFoundException e) {
           System.out.println("Файл не найден!");
       } catch (IOException e) {
           e.printStackTrace();
       }
   }

}
