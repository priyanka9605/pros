import java.util.*;
import java.io.*;
class pro1
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
int a = s.nextInt();
int b = s.nextInt();
int count=0;
int a1=0;
ArrayList<Integer> al = new ArrayList<Integer>();
while(a>0)
{
  a1 = a%10;
  a=a/10;
  count++;
  al.add(a1);
}
Collections.sort(al);
int y = count - b;
for(int i=0;i<y;i++)
 System.out.print(al.get(i));
 }
 }
