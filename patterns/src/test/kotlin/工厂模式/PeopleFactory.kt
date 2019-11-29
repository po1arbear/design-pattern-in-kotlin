package 工厂模式


/**
 * Author:xz
 * Date:2019/11/27 15:11
 * Desc:
 */
class PeopleFactory {
    enum class Country {
        UK,
        GERMANY,
        CHINESE,
        JAPAN
    }
    interface People {
        val color: String
    }
    class Asian(override val color: String = "Yellow") : People
    class Europe(override val color: String = "White") : People

    fun productPeople(country: Country): People? {
        return when (country) {
            Country.UK, Country.GERMANY -> Asian()
            Country.CHINESE, Country.JAPAN -> Europe()
        }
    }
}