import java.io.*;
import java.util.*;

class pro4
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
String st = s.next();
int sum=0;
int max=0;
String sr[] = st.split("/ \");
for(int i=0;i<sr.length;i++)
{
if(sr[i].length()==1)
 sum+=sr[i];
 else
 {
 int h = Integer.parseInt(sr[i]);
 while(h>0)
 {
 int y = h%10;
 if(y>max)
 {
 max = y;
 }
 h=h/10;
 }
 sum+=max;
 }
 }
 System.out.println(sum);
 }
 }
