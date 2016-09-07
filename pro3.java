import java.io.*;
import java.util.*;

class pro3
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int n1=0;
ArrayList<Integer> al = new ArrayList<Integer>(); 
ArrayList<Integer> al1 = new ArrayList<Integer>(); 
ArrayList<Integer> al2 = new ArrayList<Integer>(); 
for(int i=0;i<n;i++)
 {
   n1 = s.nextInt();
   int a = Integer.toBinaryString(n1);
   int b = Integer.bitCount(a);
   al.add(n1);
   al1.add(b);
   al2.add(b);
  }
   Collections.sort(al1);
   for(int i=al.size()-1;i>=0;i--)
   {
   for(int j=0;j<al.size();j++)
   {
   if(al1.get(i)==al2.get(j))
   {
   System.out.println(al.get(j));
   al2.remove(j);
   al.remove(j);
   break;
   }
   }
   }
   
   }
   }
   
