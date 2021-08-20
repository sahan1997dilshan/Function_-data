object q2
{
class Rational(x:Int,y:Int)
{
 def numer=x;
 def demon=y;
 def neg= new Rational(-this.numer,this.demon);
 def add(that:Rational)=new Rational(this.numer*that.demon+this.demon*that.numer,this.demon*that.demon);
 def sub(that:Rational)=this.add(that.neg);

 override def toString:String =numer+ "/" + demon;

} 
def main(args: Array[String])
{
val x= new Rational(3,4);
val y=new Rational(5,8);
val z=new Rational(2,7);

println("x-y-z rational number=",(x.sub(y)).sub(z));


}
}