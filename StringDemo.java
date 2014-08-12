public class StringDemo
{
public static void main(String args[])
{
String palindrome = "Dot lol I lol Tod";
StringBuilder sb = new StringBuilder(palindrome);
sb.reverse();
System.out.println(sb);
}
}
