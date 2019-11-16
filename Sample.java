package pac;

public class Sample {
 
public static void main(String[] args) {
String s1="Welcome to Qspiders";
String str[]=s1.split(" ");
System.out.println("Reversing position of word");
for (int i = str.length-1; i >=0; i--) {
	System.out.print(str[i]+" ");
}
System.out.println();
System.out.println("Reversing each words");
String rev="";
for(String s:str)
{
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
rev=rev+" ";
}
System.out.println(rev);
}
}
