package test;

/**
 *
 */
public class InitialOrderTest extends Parent {

    public static final String STATIC_FINAL_FIELD = "常量";

    public static String static_field = "静态变量";

    public String field = "变量";

    static {
        System.out.printf(STATIC_FINAL_FIELD);
        System.out.printf(static_field);
    }

    public static void main(String[] args) {
        System.out.printf("hello");
    }
}
