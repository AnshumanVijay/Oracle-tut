import java.util.Calendar;

public class CalculateDifferenceInDays
{
public static void main(String[] args)
{
Calendar calendar1 = Calendar.getInstance();
Calendar calendar2 = Calendar.getInstance();

calendar1.set(2014, 12, 8);
calendar2.set(2013, 12 ,8);

long milliSecond1 = calendar1.getTimeInMillis();
long milliSecond2 = calendar2.getTimeInMillis();

long difference = milliSecond2 - milliSecond1;

long diffinDays = difference/ (24*60*60*1000);

System.out.println("Difference in days:" + diffinDays);

}



}
