object q1
{
class Rational(x:Int,y:Int)
{
 def numer=x;
 def demon=y;
 def neg= new Rational(-this.numer,this.demon);

 override def toString:String =numer+ "/" + demon;

} 
def main(args: Array[String])
{
val x= new Rational(1,2);
val y=new Rational(3,4);
println(x.neg);

}


}