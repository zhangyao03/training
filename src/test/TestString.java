package test;

/**
 *
 */
public class TestString {

    public static void main(String[] args) {

        String testString = "\u200Bl-fcommonkylin2.wap.cn5.qunar.com";

        testString = testString.replace("\\u200B", "");

        System.out.printf(testString);

        String s = new String("adadsf134134");
        String[] sArray = s.split("a");
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 48 && s.charAt(i) < 57) {
                System.out.println(s.charAt(i));
            }
        }
    }
}
