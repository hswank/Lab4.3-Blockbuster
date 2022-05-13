import java.util.ArrayList;
import java.util.Scanner;

public class DVD extends Movie{
	Scanner input = new Scanner(System.in);
	
	public DVD(String title, int runTime) {
		super.setTitle(title);
		super.setRunTime(runTime);
	}
	
	@Override
	public void play() {
		ArrayList<String> movieScenes = super.getScenes();
		System.out.println("What scene would you like to watch?(0-5)");
		super.printScenes();
		int userChoice = input.nextInt();
		
		System.out.println("Scene " + userChoice + ": " + movieScenes.get(userChoice));		
	}
}
