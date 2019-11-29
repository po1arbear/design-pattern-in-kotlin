/**
 * Author:xz
 * Date:2019/11/21 14:03
 * Desc:
 */
class SingleTo private constructor(){
    companion object{
      val instance = SingleHodler.S
    }
    private object SingleHodler{
        val S:SingleTo = SingleTo()
    }
}