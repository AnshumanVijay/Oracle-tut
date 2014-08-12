public class DataStructure{
private final static int size = 15;
private int[] arrayofInts = new int[size];

public DataStructure() {
for (int i = 0; i < size; i++)
{
arrayofInts[i] = i;
}

}

public void printEven(){
DataStructureIterator iterator = this.new EvenIterator();
while (iterator.hasNext()) {
System.out.print(iterator.next() + " ");


}
System.out.println();

}
    
interface DataStructureIterator extends java.util.Iterator<Integer> { 

} 
    
private class EvenIterator implements DataStructureIterator {
        
private int nextIndex = 0;
public boolean hasNext() {
return (nextIndex <= SIZE - 1);

}        
        
public Integer next() {
Integer retValue = Integer.valueOf(arrayOfInts[nextIndex])
nextIndex += 2;
return retValue;
}
}
    
public static void main(String s[]) {
DataStructure ds = new DataStructure();
ds.printEven();
}
}

}
}
