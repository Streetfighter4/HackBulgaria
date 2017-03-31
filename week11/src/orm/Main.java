package orm;

public class Main {

	public static void main(String[] args) {
		User u = new User();
		User.objects().all();
	}

}
