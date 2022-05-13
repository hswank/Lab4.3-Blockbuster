import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<Movie> movies = new ArrayList<>();
		movies.add(new VHS("Space Battles", 107));
		movies.add(new VHS("Cretaceous Playground", 124));
		movies.add(new VHS("Chins", 96));
		movies.add(new DVD("Lieutenant Canada", 133));
		movies.add(new DVD("Terry Scotter and the Wizard's Rock", 102));
		movies.add(new DVD("Grapefruit Direct", 141));

		ArrayList<String> scenes1 = new ArrayList<>();
		scenes1.add("Space Warriors buy slave");
		scenes1.add("Warriors indoctrinate slave");
		scenes1.add("Slave becomes assassin");
		scenes1.add("Slave falls in love with surprise Queen");
		scenes1.add("Slave kills a bunch of kids");
		movies.get(0).setScenes(scenes1);

		ArrayList<String> scenes2 = new ArrayList<>();
		scenes2.add("Old man clones ancient lizards");
		scenes2.add("Old man brings child relatives to feed to lizards");
		scenes2.add("Everyone runs away from scary lizards");
		scenes2.add("Lizards eat their trainer");
		scenes2.add("Everyone leaves and lizards get to be free");
		movies.get(1).setScenes(scenes2);

		ArrayList<String> scenes3 = new ArrayList<>();
		scenes3.add("Person in fish home becomes dinner");
		scenes3.add("Fisherman wants trophy catch");
		scenes3.add("Fisherman beaten by fish");
		scenes3.add("Sheriff unhappy");
		scenes3.add("Fish dies");
		movies.get(2).setScenes(scenes3);

		ArrayList<String> scenes4 = new ArrayList<>();
		scenes4.add("Canada scared of war");
		scenes4.add("Genetically modified hero kills bad people");
		scenes4.add("Lieutenant Canada takes long nap");
		scenes4.add("Lieutenant Canada's girlfriend is old");
		scenes4.add("Lieutenant Canada has to kill more bad people");
		movies.get(3).setScenes(scenes4);

		ArrayList<String> scenes5 = new ArrayList<>();
		scenes5.add("Boy learns magic");
		scenes5.add("Boy is sent to school to defeat dark wizard");
		scenes5.add("Boy makes two friends");
		scenes5.add("Trio solves riddles");
		scenes5.add("Wizard ghost runs away");
		movies.get(4).setScenes(scenes5);

		ArrayList<String> scenes6 = new ArrayList<>();
		scenes6.add("Process servant witnesses murder");
		scenes6.add("Throws up on \"friend\'s\" printer");
		scenes6.add("Friends go on the run");
		scenes6.add("Protagonists have to burn down warehouse");
		scenes6.add("Trio goes out for breakfast");
		movies.get(5).setScenes(scenes6);

		System.out.println("Welcome to GC Blockbuster!");
		System.out.println("Please Select a Movie from the list:");
		for (Movie movie : movies) {
			System.out.println("   " + (movies.indexOf(movie) + 1) + ") " + movie.getTitle());
		}

		int choice = 0;
		while (choice < 1 || choice > 6) {
			System.out.println("Please select a movie you want to watch:");
			choice = input.nextInt();
		}
		choice--;

		boolean cont = true;
		movies.get(choice).printInfo();
		System.out.printf("%n%nDo you want to watch the movie? Y/N");
		String userCont = input.next();
		
		while (cont) {
			if (userCont.equalsIgnoreCase("y")) {
				System.out.printf("%n%nWhich scene of " + movies.get(choice).getTitle() + " would you like to watch? Select 0 to 4:");
				int sceneSelection = input.nextInt();
				
				ArrayList<String> movieScenes = movies.get(choice).getScenes();
				System.out.println(movieScenes.get(sceneSelection));
				
				System.out.println("Watch another scene?");
				userCont = input.next();
			} else if (userCont.equalsIgnoreCase("n")) {
				cont = false;
			} else {
				System.out.println("Please enter a valid response");
				userCont = input.next();
			}
		}
		
		System.out.println("Bye!");
	}

}
