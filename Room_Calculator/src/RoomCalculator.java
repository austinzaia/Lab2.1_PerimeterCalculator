import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Thank you for using the Room Calculator!");

		String answer;
		do {

			System.out.println("Please enter the length of the room: ");
			float length = in.nextFloat();
			System.out.println("Please enter the width of the room: ");
			float width = in.nextFloat();
			System.out.println("Please enter the height of the room: ");
			float height = in.nextFloat();
			float area = length * width;
			float perimeter = 2 * (length + width);
			float volume = length * width * height;
			System.out.println("The area of the room is: " + area);
			System.out.println("The perimeter of the room is: " + perimeter);
			System.out.println("The volume of the room is: " + volume);

			System.out.println("Do you wish to continue? (yes/no): ");
			answer = in.next();
		}
		while (answer.equals("yes"));
	}

}
