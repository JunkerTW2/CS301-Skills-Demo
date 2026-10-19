/*
a(97) b c d e f g h i j k l m n o p q r s t u v w x y z(122)
n(110) o p q r s t u v w x y z a b c d e f g h i j k l m(109)

A(65) B C D E F G H I J K L M N O P Q R S T U V W X Y Z(90)
N(78) O P Q R S T U V W X Y Z A B C D E F G H I J K L M(77)
*/

public class ROT13 {

    void main(String args[]) {
        // int test = (int) ('z' + 13); //135 should be 109 (range 97 to 122)
        // int test2 = (int) ('z' + 13) % 26; //5
        // int test3 = (int) ('z' - 'a'); //25
        // int test4 = (int) (('z' - 'a') % 26); //25
        // int test5 = (int) ((('z' - 'a') + 13) % 26); //12 (a=0 => m=12)
        // int test6 = (int) ((('z' - 'a') + 13) % 26 + 'a'); // 12+97=109
        // IO.println(test6);
        String str = args[0];
        IO.println(str);
        IO.println(ROT13(str));
    }

    public static String ROT13(String str) {
        int shift = 13;
        int letters = 26;
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            temp += (char) (((((str.charAt(i) - 'a')) + shift) % letters) + 'a');
            // IO.println(temp);
        }
        return temp;
    }
}
