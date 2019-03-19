
public class SwitchDemo {

	public static void main(String[] args) {
		// String country = "chaina";
		String country = "india";

		switch (country) {
		case "india":
			System.out.println("this is my country");
			break;
		case "pakisthan":
			System.out.println("this is not mine");
			break;

		default:
			System.out.println("this is USA");
			break;
		}
	}
}
