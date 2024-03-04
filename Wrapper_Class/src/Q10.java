import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the operation: ");
		char ch=sc.next().charAt(0);
		if(ch=='+') {
			System.out.print("Enter the value for addition: ");
			String str=sc.next();
			String[] s=str.split("sum");
			int sum=0;
			for(String str1:s) {
				sum+=Integer.parseInt(str1);
				
			}
			System.out.println("The sum is "+sum);
			
		}
		else if(ch=='*') {
			System.out.print("Enter the value for multiplication: ");
			String str2=sc.next();
			String[] m=str2.split("mul");
			int mul=1;
			for(String str3:m) {
				mul*=Integer.parseInt(str3);
			}
			System.out.println("The multiplication is "+mul);
			
		}
		else if(ch=='-') {
			System.out.print("Enter the value for subtraction: ");
			String str2=sc.next();
			String[] m=str2.split("sub");
		    int a1=Integer.parseInt(m[0]);
		    int a2=Integer.parseInt(m[1]);
		    int res=a1-a2;
		    
			System.out.println("The subtraction is "+res);
			
			
		}
		else if(ch=='/') {
			System.out.print("Enter the value for division: ");
			String str2=sc.next();
			String[] m=str2.split("div");
			int a1=Integer.parseInt(m[0]);
			int a2=Integer.parseInt(m[1]);
			double res=a1/a2;
			System.out.println("The division is "+res);
		}
		
		
		
	}

}
