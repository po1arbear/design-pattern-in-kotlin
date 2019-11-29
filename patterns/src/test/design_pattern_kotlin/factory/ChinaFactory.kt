package factory


/**
 * Author:xz
 * Date:2019/11/21 16:45
 * Desc:
 */
class ChinaFactory : AbstractFactory() {
    override fun produceCar() {
        print("比亚迪")
    }

    override fun producePlane() {
        print("生产J20")
    }
}