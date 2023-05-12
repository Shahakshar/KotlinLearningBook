import java.util.Scanner

fun main() {

    val user1 = User("mayu", 22, true)
    val user2 = User("mayuri", 24, false)
    val user3 = User("mayukumar", 25, false)
    val user4 = User("mayukumar", 25, false)

    val users = mutableSetOf<User>(user1, user2, user3, user4)

    users.forEach {
        println(it.name)
    }
    val name = mutableSetOf<String>("a1", "a2", "a3")
    name.add("a4")
    name.forEach {
        println(it)
    }

    val number = setOf<Int>(1,2,3,4)
    println(number.mapIndexedNotNull {index, value -> if(index == 0) null else index*value})
    println(number.map { it*100 })


    val numberSet = listOf(setOf(1,2,3), setOf(4,5,6), setOf(7,8,9))
    for (numbers in numberSet) {
        for (number in numbers) {
            print(number)
        }
        println()
    }

    val numberFlatten = numberSet.flatten()
    println(numberFlatten[4])


}

fun objectMatching() {
    val user1 = User("mayu", 22, true)
    val user2 = User("mayuri", 24, false)
    val user3 = User("mayukumar", 25, false)
    val user4 = User("mayukumar", 25, false)

    println(user1 == user2)
    println(user3 == user4)
}

class User(
    val name: String,
    val age: Int,
    val single: Boolean
)

fun ioStuff() {
    // taking input form user and gives result accordingly
    val score = readLine()!!.toInt()
    val error = Result.Error("This is called error")
    val success = Result.Success("this is called Success")

    if(score> 40) {
        getData(success)
    } else {
        getData(error)
    }

    val sc = Scanner(System.`in`)
    print("Enter your sscore: ")
    val sscore = sc.nextInt()
    if(sscore> 40) {
        getData(success)
    } else {
        getData(error)
    }
    println()
    RoundedButton("my name is akshar.", "vertical", 4).draw()

}

fun otherStuff2() {

//    val instance = Database.getInstance()
//    val instance1  = Database.getInstance()
//    println(instance)
//    println(instance1)

    println(DataBase)
    println(DataBase)
    println(DataBase)

    val alexAccount = AccountManagement("Alex")
    alexAccount.deposit(1000)
    val amount = alexAccount.calculateBalance()
    println(amount)
    alexAccount.withdraw(500)
    val amount1 = alexAccount.calculateBalance()
    println(amount1)
    alexAccount.withdraw(1000)
    val amount2 = alexAccount.calculateBalance()
    println(amount2)
}

object DataBase {
    init {
        println("Database created")
    }
}

fun otherStuff() {
    val intMax = Int.MAX_VALUE
    val intMin = Int.MIN_VALUE
    val some = Int.SIZE_BITS
    val some1 = Int.SIZE_BYTES

    val byteMe = Byte.SIZE_BYTES
    val shortMe = Short.SIZE_BYTES
    val shortMax = Short.MAX_VALUE
    val shortMin = Short.MIN_VALUE
    var valueShort: Short = 32767
    println(valueShort.inc())

    println("$shortMin $shortMax")
    print("$byteMe \n $shortMe")

    println("Hello World! $intMax ans $intMin and $some and $some1")

    var x = 0
    println("x = ${x++}")
    println("x = ${++x}")
    println("x = ${x--}")
    println("x = ${--x}")

    MyLearning().learnWhenKeyWord()
    MyLearning().counting()
    println()
    val total = BetweenEvenNumber().givesEvenNumberBetween(30, 40)

    println("total even number is $total")

    val minAndMax = BetweenEvenNumber().givesMaxAndMinNumber(arrayOf(1, 2, 3, 5, 8, -10, -1, 11, -11, 6, 7, 5, 3))
    println("max number is ${minAndMax[0]}")
    println("min number is ${minAndMax[1]}")
}

class MyLearning {
    fun learnWhenKeyWord() {
        val alarm = 7
        when {
            alarm == 2 -> print("this is $alarm")
            alarm > 5 || alarm < 10 -> print("this is in range and alarm is $alarm")
            alarm <= 10 -> print("this is less then 10")
            else -> {
                print("default alarm $alarm")
            }
        }
    }


    fun counting() {
        var number = 0
        while (number < 10) {
            println(++number)
        }
    }
}

