import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.println("Enter the Integer: ");
         String a=sc.next();
         System.out.println("Enter the Float: ");
         String b=sc.next();
         System.out.println("Enter the Double: ");
         String c=sc.next();
         System.out.println("Enter the Boolean: ");
         String d=sc.next();
         Integer a1=Integer.valueOf(a);
         Float a2=Float.valueOf(b);
         Double a3=Double.valueOf(c);
         Boolean a4=Boolean.valueOf(d);
         System.out.println(a1+" "+a2+" "+a3+" "+a4);
	}

}
