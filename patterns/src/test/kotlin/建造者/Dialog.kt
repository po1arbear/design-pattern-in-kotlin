package com.xz.test.建造者


/**
 * Author:xz
 * Date:2019/11/27 10:23
 * Desc:
 */
class Dialog {
    var cancelable = true
    var title = "Title"
    var leftBtnText = "left"
    var rightBtnText = "right"
    fun show() {}
}

class Test {

    fun test() {
        Dialog().apply {
            cancelable = false
            rightBtnText = "right"
            leftBtnText = "left"
            title = "title"
        }.show()
    }


}