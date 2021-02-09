import java.util.Scanner;
public class Experiment_10 {
	static int gcd(int a,int b){
		if(a==0)
			return b;
		if(b==0)
			return b;
		if(a==b)
			return a;
		if(a>b)
			return gcd(a-b,b);
		return gcd(a,b-a);
	}
	
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
       
        System.out.print("value of "+a+"/"+b+" = "+gcd(a,b));
        
    }
}
