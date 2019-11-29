//by lazy { ... }的初始化默认是线程安全的，并且能保证by lazy { ... }代码块中的代码最多被调用一次

class Singleton private constructor() {
    companion object {
        val S: Singleton by lazy { Singleton() }
    }
}

