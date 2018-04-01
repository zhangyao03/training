package test;

/**
 *
 */
public class Parent {
    public static final String STATIC_FINAL_FIELD = "父类常量";

    public static String static_field = "父类静态变量";

    public String field = "父类变量";

    static {
        System.out.printf(STATIC_FINAL_FIELD);
        System.out.printf(static_field);
    }
}
