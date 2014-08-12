public class SwitchCase
{
public static void main(String[] args){

java.util.ArrayList<String> months = new java.util.ArrayList<String>();
int month = 3;

switch(month) {
case 1: months.add("January");break;
case 2: months.add("February");break;
case 3: months.add("March");break;
case 4: months.add("April");break;
default: break;
}

if(months.isEmpty())
{
System.out.println("Invalid month number");
}
else
{
for(String monthName : months){
System.out.println(monthName);
}
}

}
}
