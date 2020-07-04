package EmailSystem;

import java.util.Scanner;

public class BodyEmail {
	private String firstname;
	private String lastname;
	private String department;
	private String password;
	private String e="laptop.com";
	private int mailcapacity=500;
	private String NEmail;
	private String email;
	//constructor that desplays firstname and lastname
	BodyEmail(String firstname,String lastname){
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Hello " +firstname +" " +lastname);
	//method to ask for department and returning it
	this.department=YourDepartment();
	System.out.println("You are from " +department +" department");
	
	//call a method that returns random password
	System.out.println("Enter the length of password:");
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	password=Rp(l);
	System.out.println("Your new passord is: " +password);
	
	//combine and generate email
	
	email=firstname +"." +lastname +"@" +department +e;
	System.out.println("Your email created");
	}
	//ask for department
	private String YourDepartment() {
		System.out.println("Choose \n1 for Science \n2 for Commerce \n3 for Arts \n4 for Humanities");
		Scanner sc=new Scanner(System.in);
		int op= sc.nextInt();
		switch(op){
			case 1:
				return "Science";
			case 2:
				return "Commerce";
			case 3:
				return "Arts";
			case 4:
				return "Humanities";
			default:
				return "****error: Select the correct department****";
		}
	}
	//random password 
	private String Rp(int length) {
		
		String p="QWERTYUIOPASDFGHJKLZXCVBNM!£$%1234567890";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*p.length());
			password[i]=p.charAt(rand);
		}
		return new String(password);
	}
	//set mail capacity
	public void setEmailCapacity(int Capacity) {
		mailcapacity=Capacity;
	}
	//get mail capacity
	public int getMailCapacity() {return mailcapacity;}
	//set alt email
	public void setAlternateEmail(String newEmail) {this.NEmail=newEmail;}
	private String getAlternateEmail() {return NEmail;}
	
	//show all information
	public String allInfo() {
		System.out.println("---------------------------------");
		return "Email= " +email +"\nDepartment= "+department +"\npassword= " +password
				+"\nAlternate email= " +NEmail
				+"\n----------------------------------";
	}
	}
