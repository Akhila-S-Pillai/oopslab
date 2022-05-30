public class StrCompare
{
public static void main(String args[])
{
String s1="Hello";
String s2="hello";
String s3=s1.toLowerCase();
String s4=s2.toLowerCase();
int i=s3.compareTo(s4);
if (i==0)
{
System.out.println("Both strings are equal");
}
else
{
System.out.println("Both strings are  not equal");
}
}
}
