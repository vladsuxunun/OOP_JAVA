package labb4_11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
public class Main {
	
	static ArrayList<Student> studentsList=new ArrayList<Student>();
	public static void writeStudentsInfo() {
		try {
			int best=100;
			BufferedWriter bw=new BufferedWriter(new FileWriter("grades.txt"));
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
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void readStudentsInfo() {
			try{
				BufferedReader br = 
					new BufferedReader(new FileReader("scores.txt"));
				String info = "";

				while((info=br.readLine())!=null){
					String surnasc[]=info.split(" ");
					studentsList.add(new Student(surnasc[0],surnasc[1],Integer.parseInt(surnasc[2])));
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
		showArrayList();
		writeStudentsInfo();
	}
}