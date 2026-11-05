/**
 * Write a Java regular expression to match phone
 * numbers, with or without area codes.
 * The area codes should be of the form
 * (609) 555-1234 or 555-1234.
 */
public class MatchPhoneNumber {

    void main(String args[]) {
        String regexp = "(\\([0-9]{3}\\))?[0-9]{3}-[0-9]{4}";
        while (!StdIn.isEmpty()) {
            String text = StdIn.readString();
            if (text.matches(regexp)) {
                StdOut.println("[Yes]");
            } else {
                StdOut.println("[No]");
            }
        }
    }
}
