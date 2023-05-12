class AccountManagement(val accountName : String) {

    private var balance = 0
    private var transaction = mutableListOf<Int>()

    fun deposit(amount: Int) {
        if(amount>0) {
            transaction.add(amount)
            balance += amount
            println("$amount deposited, balance is now ${this.balance}")
        } else {
            println("can't be negative value")
        }
    }

    fun withdraw(withdrawal: Int) {
        if(balance >= withdrawal) {
            transaction.add(-withdrawal)
            balance -= withdrawal
            println("$withdrawal withdraw, balance is now $balance")
        } else {
            println("balance is not sufficient")
        }
    }

    fun calculateBalance(): Int {
        balance = 0
        for (transaction in transaction) {
            balance += transaction
        }

        return balance
    }
}