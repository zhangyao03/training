package string;

/**
 * @author alfred.zhang
 * @date 2019/12/20
 */
public class StringUtils {

    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNotEmpty(CharSequence cs) {
        return !StringUtils.isEmpty(cs);
    }

    /**
     *
     */
    public static class TestString {

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
}
