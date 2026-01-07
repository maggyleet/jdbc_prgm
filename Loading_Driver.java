package programz;

public class Loading_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded successfully!");
			}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
