package 代理

import org.junit.jupiter.api.Test


/**
 * Author:xz
 * Date:2019/11/28 10:01
 * Desc:
 */
interface People {
    fun speak()
}
class Broker :People{
    override fun speak() {
        print("hello")
    }
}
class Star(private val broker: Broker) :People by broker

class Test{
    @Test
    fun test(){
        val broker = Broker()
        val star = Star(broker)
        star.speak()
    }
}

