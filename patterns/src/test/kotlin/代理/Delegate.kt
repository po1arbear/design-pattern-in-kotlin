package 代理

import org.junit.jupiter.api.Test
import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


/**
 * Author:xz
 * Date:2019/11/29 10:46
 * Desc:
 */
class Delegate {
    // 运算符重载
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }

}

class Example {
    var d: String by Delegate()
    var readWriteProperty: String? by A()
    val readOnlyProperty:String? by B()

    @Test
    fun test(){

        d = "d value"
        println("$d")

        println("-------------------")

        readWriteProperty ="readWriteProperty value"
        println("$readWriteProperty")

        println("-------------------")

        println("$readOnlyProperty")

    }
}


class A : ReadWriteProperty<Any?, String?> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): String? {
        println("readWriteProperty getValue invoked")
        return "readWriteProperty"
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String?) {
        println("readWriteProperty setValue invoked")
    }

}

class B : ReadOnlyProperty<Any?, String?> {
    override fun getValue(thisRef: Any?, property: KProperty<*>): String? {
        return "ReadOnlyProperty"
    }
}
