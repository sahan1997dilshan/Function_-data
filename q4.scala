object q4{

def main(args:Array[String]):Unit = {
        val acc1 = new Account("100", 1, -1000)
        val acc2 = new Account("200", 2, 500)
        val acc3 = new Account("300", 3, -20)
        val acc4 = new Account("400", 4, 1200)
        val acc5 = new Account("500", 5, 10000)
        

        var bank:List[Account] = List(acc1, acc2, acc3, acc4, acc5)

        println("Overdraft Account List")
        overdraft(bank).foreach(i => println(i))
        println()

        println("Sum of All Accounts: Rs " + Totalbalance(bank))
        println()

        println("Sum of All Accounts(After Interest): Rs " + Totalbalance(interest(bank)))
        println()
    }

    val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)

    val Totalbalance = (b:List[Account]) => b.reduce((x, y) => new Account("", 0, x.balance + y.balance)).balance

    val interest = (b:List[Account]) => b.map(x => if(x.balance >=0) new Account(x.nic, x.acnumber, x.balance + x.balance * 0.005) else new Account(x.nic, x.acnumber, x.balance + x.balance * 0.01))
}

class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val acnumber:Int = n
  var balance:Double = b

  def withdraw(a:Double) = this.balance -= a

  def deposit(a:Double) = this.balance += a

  def transfer(a:Account, b:Double):Unit = {
    this.withdraw(b)
    a.deposit(b)
  }

  override def toString = "[" + this.nic + ":" + this.acnumber + ":" + this.balance + "]"

    
}