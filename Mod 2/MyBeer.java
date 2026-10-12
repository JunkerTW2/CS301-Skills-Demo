public class MyBeer {

    void main(String args[]) {

        int people = Integer.parseInt(args[0]);
        int[] beers = new int[people];
        // int sameBeer = 0;
        int passedTrials = 0;

        for (int i = 0; i < 1000; i++) {
            boolean pass = false;
            for (int j = 0; j < people; j++) {
                beers[j] = j;
            }
            for (int k = 0; k < people; k++) {
                int newBeer = k + (int) (Math.random() * (people - k));
                int temp = beers[k];
                beers[k] = beers[newBeer];
                beers[newBeer] = temp;
            }
            for (int m = 0; m < people; m++) {
                if (beers[m] == m) {
                    // sameBeer++;
                    pass = true;
                }
            }
            if (pass == true) {
                passedTrials++;
            }
            // IO.println(sameBeer + " people got their beer back. " + passedTrials + "
            // trials passed");
            // sameBeer = 0;
        }
        double passRate = (double) passedTrials / 1000;
        IO.println("Pass rate is: " + passRate * 100 + "%");
    }
}
