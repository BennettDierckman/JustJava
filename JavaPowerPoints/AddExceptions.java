import java.util.Scanner;
import java.util.ArrayList;

public class AddExceptions {
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {		
		
		ArrayList<String> movieList = new ArrayList<>();
		
		while (true) {
			System.out.print("Enter a movie title, or STOP: ");
			String movie = input.nextLine();
			
			if (movie.equalsIgnoreCase("STOP"))
				break;
			
			// We need to handle the exception here
			getNewMovie(movieList, movie);
			
		}
		
		System.out.println("The total number of movies is: " + movieList.size() + "\n");
		
		for (int i = 0; i < movieList.size(); i ++)
			System.out.println(movieList.get(i));
		System.out.println();
					
	}
	
	// We need to specify what type of exceptions this method throws
	public static void getNewMovie(ArrayList<String> movies, String newMovie){
		
		if (newMovie.equalsIgnoreCase("Jaws")) {
			System.out.println("Jaws changes your third movie title to 'Chum'!");
			movies.set(2, "Chum");
		}
		else if (newMovie.equalsIgnoreCase("Rocky")) {
			System.out.println("Rocky changes your second movie title to 'Knocked Out'!");
			movies.set(1, "Knocked Out");
		}
		
		movies.add(newMovie);
	}
}

