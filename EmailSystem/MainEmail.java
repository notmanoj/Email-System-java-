package EmailSystem;

public class MainEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BodyEmail bd=new BodyEmail("Krismeen","Lama");
		bd.setAlternateEmail("Krismeen.lama@beautiful.com");
		System.out.println(bd.allInfo());
	}

}
