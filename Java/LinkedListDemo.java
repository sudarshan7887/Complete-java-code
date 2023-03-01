import java.util.*;
public class LinkedListDemo
{
public static void main(String args[])
{
LinkedList l1=new LinkedList();
l1.add("F");
l1.add("B");
l1.add("D");
l1.add("E");
l1.add("C");
l1.add("Z");
l1.add("A");
l1.add("A2");
System.out.println("intial content of LinkedList is:"+l1);
l1.remove("D");
l1.remove("2");
System.out.println("content of LinkedList after deletion is:"+l1);
l1.removeFirst();
l1.removeLast();
System.out.println("content of LinkedList after remove first and last is:"+l1);
Object val=l1.get(2);
l1.set(2,(String)val+"changed");
System.out.println("content of LinkedList after changed is:"+l1);
}
}