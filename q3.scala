object q3
{ var bank:List[Account]=List()
 class Account(id:String,n: Int, b: Double) {
   val nic:String=id
   val acnumber: Int = n
   var balance: Double = b
   
   def withdraw(a:Double) = this.balance-=a;

   def deposit(a:Double) = this.balance+=a;

   def transfer(that:Account,b:Double):Unit={
    this.balance=this.balance-b;
    that.balance=that.balance+b;
     }
   
    override def toString =
     "["+nic+":"+acnumber +":"+balance+"]"
}
    def main(args: Array[String]):Unit = {
      val acc1=new Account("110",20,1000)
      val acc2=new Account("120",25,900)

      println("Before Tranfer")
      println(acc1)
      println(acc2)
       
      acc1.transfer(acc2,100)
      println()

      println("After Tranfer")
      println(acc1)
      println(acc2)


      
    }
 
}