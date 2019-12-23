package lab4_2;
import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;  
public class Driver {
	static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	static ArrayList<Course> courses = new ArrayList<Course>();
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static String encryptThisPassword(String input) 
    { 
        try { 
            MessageDigest md = MessageDigest.getInstance("SHA-1"); 
            byte[] messageDigest = md.digest(input.getBytes()); 
            BigInteger no = new BigInteger(1, messageDigest); 
            String hashtext = no.toString(16); 
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            }
            return hashtext; 
        } 
        catch (NoSuchAlgorithmException e) { 
            throw new RuntimeException(e); 
        } 
    }
	static void addNewAdmin() {
		try {
			BufferedWriter bw=new BufferedWriter(new FileWriter("userpass.txt",true));
			bw.write("vlad"+" "+encryptThisPassword("vlad")+"\n");		
			bw.close();
		}catch(Exception e) {
			e.printStackTrace();
			}
	}
	static void loadingCourseInfo() {
		try{
            ObjectInputStream inStream =
                    new ObjectInputStream(new FileInputStream("courseinfo.txt"));

		
				inStream.close();
			}else {
				
			}
			
			
        }catch (Exception e) {
            e.printStackTrace();
        }
	}
	static void userModeFunction() throws IOException {
		System.out.println("Welcome to USER MODE!");
		while(true) {	
			System.out.println("Enter [1] to see the list of available courses");
			System.out.println("Enter [2] to display information about the course");
			System.out.println("Enter [0] to exit");
			String seemode=br.readLine();
			if(seemode.equals("1")) {
				  System.out.println("Available Courses:");
				  //ArrayList<Course> courses = new ArrayList<Course>();
			        try{
			            ObjectInputStream inStream =
			                    new ObjectInputStream(new FileInputStream("courseinfo.txt"));

					    courses = (ArrayList<Course>)inStream.readObject();
						inStream.close();
                        for(Course c : courses){
			            System.out.println(c.toString());
			            }
						
			        }catch (Exception e) {
			            e.printStackTrace();
			        }
			         System.out.println();
			}else if(seemode.equals("2")) {
		        try{
		            ObjectInputStream inStream =
		                    new ObjectInputStream(new FileInputStream("courseinfo.txt"));

				    courses = (ArrayList<Course>)inStream.readObject();
					inStream.close();
                    for(Course c : courses){
		            System.out.println(c.showAll());
		            }
					
		        }catch (Exception e) {
		            e.printStackTrace();
		        }
			}else if(seemode.equals("0")) {
				System.out.println("Good bye!");
				break;
			}else {
				System.out.println("Wrong character was entered! Please try again!");
			}
		}
	}
	static void adminModeFunction() throws IOException {
		boolean access=false;
		String admin="";
		while(true) {
		System.out.println("Please enter your username:");
		String username=br.readLine();
		System.out.println("Please enter your password:");
		String password=br.readLine();
		String encrypted=encryptThisPassword(password);
		try{
			BufferedReader br2 = 
				new BufferedReader(new FileReader("userpass.txt"));
			String info = "";

			while((info=br2.readLine())!=null){
				String userpass[]=info.split(" ");
				if(username.equals(userpass[0]) && encrypted.equals(userpass[1])) {
					access=true;
					admin=userpass[0];
				}
				
		}br2.close();
			
		}catch(Exception e){
			e.printStackTrace();
   	    }
		if(access) {
			break;
		}
		}
		if(access==true) {
			
			try {
				Date date=new Date();
				BufferedWriter bw=new BufferedWriter(new FileWriter("admin.txt",true));
				bw.write(formatter.format(date)+" "+"admin "+"\""+admin+"\""+" logged into a system"+"\n");
				bw.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Welcome to ADMIN MODE!");
			while(true) {					
				System.out.println("Enter [1] to add a new course(textbooks,instructor)");
				System.out.println("Enter [0] to exit");
				String choosing=br.readLine();
				
				if(choosing.equals("1")) {
					
					System.out.println("Enter the name of course:");
					String coursename=br.readLine();
					try {
						Date date=new Date();
						BufferedWriter bw=new BufferedWriter(new FileWriter("admin.txt",true));
						bw.write(formatter.format(date)+" "+"admin "+"\""+admin+"\""+" added new course "+"\""+coursename+"\""+"\n");
						bw.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
					System.out.println();
					System.out.println("Fill information about textbook!");
					System.out.println();
					System.out.println("Enter textbook's ISBN:");
					String isbn=br.readLine();
					System.out.println("Enter textbook's title:");
					String title=br.readLine();
					System.out.println("Enter textbook's author:");
					String author=br.readLine();
					Textbook textbook=new Textbook(isbn,title,author);
							try {
								Date date=new Date();
								BufferedWriter bw=new BufferedWriter(new FileWriter("admin.txt",true));
								bw.write(formatter.format(date)+" "+"admin "+"\""+admin+"\""+" added new textbook "+"\""+title+"\""+"\n");
								bw.close();
							}catch(Exception e) {
								e.printStackTrace();
							}
							System.out.println();
							System.out.println("Fill information about instructor!");
							System.out.println();
							System.out.println("Enter instructor's first name:");
							String firstname=br.readLine();
							System.out.println("Enter instructor's last name:");
							String lastname=br.readLine();
							System.out.println("Enter instructor's department:");
							String department=br.readLine();
							System.out.println("Enter instructor's email:");
							String email=br.readLine();
							Instructor instructor=new Instructor(firstname,lastname,department,email);
							try {
								Date date=new Date();
								BufferedWriter bw=new BufferedWriter(new FileWriter("admin.txt",true));
								bw.write(formatter.format(date)+" "+"admin "+"\""+admin+"\""+" added new instructor "+"\""+firstname+" "+lastname+"\""+"\n");
								bw.close();
							}catch(Exception e) {
								e.printStackTrace();
							}
							courses.add(new Course(coursename,textbook,instructor));
					        try{
					            ObjectOutputStream outStream =
					                    new ObjectOutputStream(new FileOutputStream("courseinfo.txt"));
					            outStream.writeObject(courses);
					            outStream.close();
					        }catch (Exception e) {
					            e.printStackTrace();
					        }
					        System.out.println();
					        System.out.println("Course has been added successfully!");
				}else if(choosing.equals("0")) {
					System.out.println("Good bye!");
					break;
				}else {
					System.out.println("Wrong character was entered! Please try again!");
				}
			}
		}else {
			System.out.println("Wrong username or password!");
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		loadingCourseInfo();
		
		while(true) {
		System.out.println("Welcome to Program!");
		System.out.println("Enter "+"\""+"user\""+" to enter to USER MODE");
		System.out.println("Enter "+"\""+"admin\""+" to enter to ADMIN MODE");
		System.out.println("Enter "+"\""+"exit\""+" to exit from program");
		String choice=br.readLine();
		if(choice.equalsIgnoreCase("user")) {
			userModeFunction();
		}else if(choice.equalsIgnoreCase("admin")) {
			adminModeFunction();
		}else if(choice.equalsIgnoreCase("exit")) {
			System.out.println("Good bye!");
			break;
		}
		}
		
	}
}