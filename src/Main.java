import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List movieDuration = new ArrayList<>();
        movieDuration.add(90);
        movieDuration.add(100);
        movieDuration.add(95);
        movieDuration.add(60);
        movieDuration.add(150);
        movieDuration.add(160);
        movieDuration.add(110);
        movieDuration.add(70);
        movieDuration.add(115);
        movieDuration.add(105);
        movieDuration.add(85);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Flight Duration in minutes: ");
        int flightDuration = scanner.nextInt();


        List bestPair = MovieSelector.selectMoviePair(movieDuration, flightDuration);


        System.out.println("Best choice of movies: " + bestPair);
    }
}