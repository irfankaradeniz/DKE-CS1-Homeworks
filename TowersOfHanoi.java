import java.util.Scanner;
public class TowersOfHanoi{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number of disks that you want to play with: ");
		int numberOfDisks = scanner.nextInt();
		moveAlgorithm(numberOfDisks,1,2,3);
  }
  	public static void moveAlgorithm(int x, int first, int second, int third){
  		if (x ==1) {
  			System.out.println("Move the disk " + x + " from stack " + first + " to the stack " + third);
  			return;
  		}
  		moveAlgorithm(x-1, first, third, second);
  		System.out.println("Move the disk " + x + " from stack " + first + " to the stack " + third);
  		moveAlgorithm(x-1, second,first,third);
  		}
}


