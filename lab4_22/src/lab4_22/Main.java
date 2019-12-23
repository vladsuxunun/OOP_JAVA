package lab4_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
public class Main {
	static int cnt=0;
	static ArrayList<Integer> scores=new ArrayList<Integer>();
	static ArrayList<Student> studentsList=new ArrayList<Student>();

	public static int getAverage() {
		int sum=0;		
		for(int i=0;i<scores.size();i++) {
			sum+=scores.get(i);
		}
		return (sum/cnt);
	}
	
	public static int getMinimum(){
	    int min = studentsList.get(0).getScore();
	    for(int i = 0; i < studentsList.size();i++) {
	      int grade = studentsList.get(i).getScore();
	      if(min > grade) {
	        min = grade;
	      }
	    }
	    return min;
	  }
	
	public static int getMaximum() {
		 int max = studentsList.get(0).getScore();
		    for(int i = 0; i < studentsList.size();i++) {
		      int grade = studentsList.get(i).getScore();
		      if(max < grade) {
		        max = grade;
		      }
		    }
		    return max;
	 }
	
	public static void writeStudentsInfo() {
		try {
			int best=100;
			BufferedWriter bw=new BufferedWriter(new FileWriter("grades.txt",true));
			for(Student st:studentsList) {
				if(st.getScore()>=best-10) {
					st.setScoreChar('A');
					bw.write(st.withCharScore());
				}else if(st.getScore()>=best-20) {
					st.setScoreChar('B');
					bw.write(st.withCharScore());
				}else if(st.getScore()>=best-30) {
					st.setScoreChar('C');
					bw.write(st.withCharScore());
				}else if(st.getScore()>=best-40) {
					st.setScoreChar('D');
					bw.write(st.withCharScore());
				}else {
					st.setScoreChar('F');
					bw.write(st.withCharScore());
				}
				
			}
			bw.write("Average - "+getAverage()+"\n");
			bw.write("Maximum - "+ getMaximum()+"\n");
		    bw.write("Minimum - "+ getMinimum()+"\n"+"\n");
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void readStudentsInfo() {
			try{
				BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
					
				String info = "";

				while((info=br.readLine())!=null){
					String surnasc[]=info.split(" ");
					scores.add(Integer.parseInt(surnasc[2]));
					studentsList.add(new Student(surnasc[0],surnasc[1],Integer.parseInt(surnasc[2])));
					cnt++;
					//System.out.println(info);
				}
				br.close();
			}catch(Exception e){
				e.printStackTrace();
       	    }
	}
	
	public static void showArrayList() {
		for(Student st:studentsList) {
			System.out.println(st.toString());
		}
	}
	public static void main(String[] args) {
		readStudentsInfo();
		//showArrayList();
		writeStudentsInfo();		
	}
}