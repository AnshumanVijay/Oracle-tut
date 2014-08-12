public class ValueOfDemo {
public static void main(String[] args) {
int numArgs = args.length();

if (numArgs < 2) {
		System.out.println("blah");
	}	else
	{
int sum  = 0;
for (int i = 0; i < numArgs; i++) {
	sum = sum + Integer.valueof(args[i]).intValue();
}
System.out.println(sum);
}
}
}