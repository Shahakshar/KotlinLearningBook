open class View {

    open fun draw() {
        println("draw a simple view")
    }

}

open class Button(private val text:String, private val orientation: String) : View() {
    override fun draw() {
        println("Draw Button with Text $text and with orientation $orientation")
        super.draw()
    }
}

class  RoundedButton(text: String, orientation: String, val corner: Int) : Button(text, orientation) {
    override fun draw() {
        println("Draw Button with corner $corner")
        super.draw()
    }
}