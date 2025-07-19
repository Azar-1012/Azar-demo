public class ReverseInteger{
    public static void main(String[] args){
        //method using algorithm
        long num=12345l;
        long rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;

        }
        System.out.println("ReversedInteger: "+rev);


        //method using stringbuffer
        long num1=123456789l;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}