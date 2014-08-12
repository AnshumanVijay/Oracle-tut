public class Calculator
{
interface IntegerMath{
int operation(int a, int b);
}
public int operateBinary(int a, int b, IntegerMath op){
return op.operation(a, b);
}
public static void main(String[] args)
{
Calculator myApp = new Calculator();
IntegerMath addition = (a,b) -> a + b ;
IntegerMath subtraction = (a,b) -> a - b ;
IntegerMath Multiplication = (a,b) -> a * b ;
IntegerMath Division = (a,b) -> a / b ;
IntegerMath Mod = (a,b) -> a % b ;

System.out.println("40 + 2 = " + myApp.operateBinary(40,2,addition));
System.out.println("40 - 2 = " + myApp.operateBinary(40,2,subtraction));
System.out.println("40 * 2 = " + myApp.operateBinary(40,2,Multiplication));
System.out.println("40 / 2 = " + myApp.operateBinary(40,2,Division));
System.out.println("40 % 2 = " + myApp.operateBinary(40,2,Mod));
}
}
