public class MissingNumber {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,7,8,9,10};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];//49
        }
        int sum1=0;
        for(int j=1;j<=10;j++){
            sum1=sum1+j;//55

        }
        System.out.println("Missing number is "+(sum1-sum));


//////Actual Method
        int num[] = {-1,1,2,3,4,5,6};
		int act = 0;
		int exp = 0;
		
		for(int i=0; i<num.length; i++) {
			act = act+num[i];
		}
		
		int lastNum = num[num.length-1];
		int firstNum = num[0];
		
		while(firstNum <= lastNum) {
			exp = exp+firstNum;
			firstNum = firstNum+1;
		}
		
		int missingNum = exp-act;
		System.out.println("Missing number is: "+ missingNum);



	

    }
    
}
