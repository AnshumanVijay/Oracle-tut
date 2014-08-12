public class ObjectDemo{
public static void main(String[] args)
{
Point originOne = new Point(24,54);
Rectangle rect1 =new Rectangle(originOne, 100, 150);

System.out.println("Width of 1st rectangle: " + rect1.width);
System.out.println("Area: " + rect1.getArea());

rect1.move(75,0);
System.out.println("X position: " + rect1.origin.x);
}

}
