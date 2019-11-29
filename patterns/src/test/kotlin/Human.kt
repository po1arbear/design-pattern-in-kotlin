import org.junit.jupiter.api.Test

/**
 * Author:xz
 * Date:2019/11/21 10:47
 * Desc:
 */
class Human {
    var name:String?="Robot"
    var age:Int=3
    fun printLn(){
        println("name:$name age:$age")
    }
}


class Test{
    @Test
    fun test(){
        val human = Human().apply {
            name ="Allen"
            age=18
        }



        human.printLn()

        with(human){

        }
    }
}