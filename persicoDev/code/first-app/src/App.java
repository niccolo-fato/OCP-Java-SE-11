import java.util.Scanner;

class App {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		String input;
		input = myObj.nextLine();
		System.out.println("The input is: " + input);
        myObj.close();
	}
}