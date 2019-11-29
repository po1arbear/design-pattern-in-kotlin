package adapter


/**
 * Author:xz
 * Date:2019/11/21 17:03
 * Desc:
 */
open class V5Charger : Charger {
    override fun charge() {
        println("使用5V充电器头")
    }
}