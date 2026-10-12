/*
 * Integer command-line argument n.
 * Read n floats from standard input ()
 * Create array (Need somewhere to put them and reference)
 * Loop through floats to assign from standard input.
 * Add inputs together
 * Print mean.
 * Print sample standard deviation
 * = sqrt(riemann sum(((average - fpn)*(average - fpn)) divided by (n-1)))
 */
public class Stats {

    void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        double[] fpn = new double[n];
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            fpn[i] = StdIn.readDouble();
            sum += fpn[i];
        }
        double mean = sum / n;
        sum = 0;
        for (int i = 0; i < n; i++) {
            double difference = mean - fpn[i];
            double diffSquared = difference * difference;
            sum += diffSquared;
        }
        double deviation = Math.sqrt(sum / (n - 1));
        IO.println("Mean: " + mean);
        IO.println("Sample Standard Deviation: " + deviation);
    }
}
