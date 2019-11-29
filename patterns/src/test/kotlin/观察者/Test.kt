package 观察者

import kotlin.properties.Delegates


/**
 * Author:xz
 * Date:2019/11/29 14:59
 * Desc:
 */
class Test {
    var str: String by Delegates.observable("empty", fun(init, old, new) {
        println("init$init old$old new$new")
    })

    fun test() {
      str = "abc"
    }
}