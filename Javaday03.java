import java.util.Scanner;

public class Javaday03 {
    public static void main(String[] args) {
        
    

    System.out.println("Rightangled star pattern");
    System.out.println("Enter rows");
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
     sc.close();

    for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print("* ");

        }
        System.out.println();
    }

    }

}
