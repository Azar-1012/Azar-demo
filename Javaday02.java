
import java.util.Scanner;

class Javaday02{
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a String");
    String s1=sc.nextLine();
    sc.close();
    @SuppressWarnings("StringBufferMayBeStringBuilder")
    StringBuffer sf=new StringBuffer(s1);
    System.out.println("Reversed String");
    System.out.println(sf.reverse());

}
}