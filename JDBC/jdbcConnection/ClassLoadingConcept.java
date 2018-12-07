package jdbcConnection;

public class ClassLoadingConcept {

	public static void main(String[] args) {
		try
		{
			Class.forName("jdbcConnection.Tree");
			System.out.println("Class Loaded Succesfully.........");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}

	}

}
