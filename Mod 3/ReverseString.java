public class ReverseString {

    void main() {
        IO.print("Type a string: ");
        String str = StdIn.readString();
        IO.println("Reversed string is: " + reverseString(str));
    }

    public static String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        }
        return str.charAt(str.length() - 1)
                + reverseString(str.substring(0, str.length() - 1));
    }
}
