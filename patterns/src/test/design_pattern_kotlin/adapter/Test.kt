package adapter

import org.junit.jupiter.api.Test


/**
 * Author:xz
 * Date:2019/11/21 17:05
 * Desc:
 */
class Test {
    @Test
    fun test() {
        val v5Charger = V5Charger()
        v5Charger.charge()

        val v20Charger = V20Charger()
        v20Charger.charge()

        //只有一个20V的充电头，要转换成5V

        val v5Adapter = V20toV5Adapter(v20Charger)
        v5Adapter.charge()

    }


    class V20toV5Adapter(private val v20Charger: V20Charger) : V5Charger() {
        override fun charge() {
            super.charge()
            v20Charger.charge()
        }
    }
}