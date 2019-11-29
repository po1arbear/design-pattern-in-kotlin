package factory


/**
 * Author:xz
 * Date:2019/11/21 16:47
 * Desc:
 */
class USFactory : AbstractFactory() {
    override fun produceCar() {
        print("生成特斯拉")
    }

    override fun producePlane() {
        print("生产F-35")
    }
}