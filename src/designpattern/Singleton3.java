package designpattern;

/**
 *
 * 枚举类实现单例模式是 effective java 作者极力推荐的单例实现模式，
 * 因为枚举类型是线程安全的，并且只会装载一次，
 * 设计者充分的利用了枚举的这个特性来实现单例模式，枚举的写法非常简单，
 * 而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式。
 *
 * @author alfred.zhang
 * @date 2021/9/25
 */
public class Singleton3 {

    private Singleton3(){

    }

    /**
     * 枚举类型是线程安全的，并且只会装载一次
     */
    private enum Singleton{
        INSTANCE;

        private final Singleton3 instance;

        Singleton(){
            instance = new Singleton3();
        }

        private Singleton3 getInstance(){
            return instance;
        }
    }

    public static Singleton3 getInstance(){

        return Singleton.INSTANCE.getInstance();
    }
}
