package test;

/**
 *
 */
public class TestString {

    public static void main(String[] args) {
        String s = new String("adadsf134134");
        String[] sArray = s.split("a");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 48 && s.charAt(i) < 57) {
                System.out.println(s.charAt(i));
            }
        }
    }
}
