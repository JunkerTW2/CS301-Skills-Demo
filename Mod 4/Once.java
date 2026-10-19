public class Once {

    void main() {
        IO.println(once("ABCDBADDAB"));
        IO.println(once("ABCDBADDABCDBAZ"));
        IO.println(once("ZABCDBADDABCDBA"));
        IO.println(once("ABCDBADZDABCDBA"));
    }

    public static String once(String str) {
        String temp = "";
        int count = 0;
        boolean unique = false;
        for (int i = 0; i < str.length(); i++) {
            // IO.println("outer = " + i);
            unique = true;
            char c = str.charAt(i);
            // IO.println("char selected: " + c);
            for (int j = 0; j < str.length(); j++) {
                // IO.println("inner = " + j);
                if (str.charAt(j) == c) {
                    count++;
                    // IO.println(c + " count = " + count);
                    if (count >= 2) {
                        unique = false;
                        count = 0;
                        // IO.println("found duplicate!");
                        break;
                    }
                }
                if (j == str.length() - 1 && count < 2) {
                    // IO.println("unique!");
                    return temp += c;
                }
            }
        }
        if (unique) {
            return temp;
        }
        return "None";
    }
}
