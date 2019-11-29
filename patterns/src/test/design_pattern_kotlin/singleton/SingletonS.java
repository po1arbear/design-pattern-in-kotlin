package singleton;

/**
 * Author:xz
 * Date:2019/11/21 13:59
 * Desc:
 */
public class SingletonS {

    private static class SingletonHolder {
        private static SingletonS S = new SingletonS();
    }

    SingletonS getInstance() {
        return SingletonHolder.S;
    }
}
