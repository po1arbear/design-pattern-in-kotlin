package singleton;

/**
 * Author:xz
 * Date:2019/11/21 11:44
 * Desc:
 */

public class SingletonJ1 {
    private static SingletonJ1 S = new SingletonJ1();

    private SingletonJ1() {
    }

    public static SingletonJ1 getInstance() {
        return S;
    }

}