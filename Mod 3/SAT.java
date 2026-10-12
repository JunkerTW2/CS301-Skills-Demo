
/*
20000 student applications
mean = 1200
deviation = 100
admitting = 5000
*/
import java.util.*;

public class SAT {

    void main() {
        int applicants = 20000;
        double mean = 1200;
        double deviation = 100;
        int admitting = 5000;
        double[] scores = new double[applicants];
        for (int i = 0; i < applicants; i++) {
            scores[i] = StdRandom.gaussian(mean, deviation);
        }
        Arrays.sort(scores);
        int accepted = (applicants - admitting);
        double acceptedScore = scores[accepted];
        IO.println("The lowest score to get admitted is: " + acceptedScore);
    }
}
