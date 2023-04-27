import java.util.ArrayList;
import java.util.List;

public class MovieSelector {
    public static  List selectMoviePair(List<Integer> movieDuration, int flightDuration) {

        int maxDuration = flightDuration - 30;


        int maxSeenDuration = 0;
        List bestPair = new ArrayList<>();


        for (int i = 0; i < movieDuration.size() ; i++) {
            for (int j = i + 1; j < movieDuration.size(); j++) {

                int pairDuration = movieDuration.get(i) + movieDuration.get(j);


                if (pairDuration <= maxDuration) {

                    if (pairDuration > maxSeenDuration) {
                        maxSeenDuration = pairDuration;
                        bestPair.clear();
                        bestPair.add(i);
                        bestPair.add(j);
                    }
                }
            }
        }

        return bestPair;
    }
}

