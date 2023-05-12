sealed class Result(private val message: String) {
    fun showMessage() {
        println("Result: $message")
    }
    class Success(message: String) : Result(message)
    class Error(message: String) : Result(message)
}


fun getData(result: Result) {
    when(result) {
        is Result.Error -> {result.showMessage()}
        is Result.Success -> {result.showMessage()}
    }
}
