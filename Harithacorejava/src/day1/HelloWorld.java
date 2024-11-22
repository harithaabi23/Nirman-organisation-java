package day1;

public class HelloWorld {
public static void main(String[] args) {
	
	int firstnum = 10;
	int secondnum = 20;
	
	System.out.println(" Arithmatic Operators");
	int add = firstnum + secondnum;
	System.out.println("add:" +add);	
	int sub = firstnum - secondnum;
	System.out.println("sub:" +sub);	
	int mul = firstnum * secondnum;
	System.out.println("mul:" +mul);
	int div = firstnum / secondnum;
	System.out.println("div:" +div);
	int mod = firstnum % secondnum;
	System.out.println("mod:" +mod);
	
	System.out.println(" Relational Operators");
	System.out.println("greater: " +(firstnum>secondnum));
	System.out.println("lesser than: " +(firstnum<secondnum));
	System.out.println("greater or equal: " +(firstnum>=secondnum));
	System.out.println("lesser or equal: " +(firstnum<=secondnum));
	System.out.println("equal: " +(firstnum==secondnum));
	System.out.println("not equal: " +(firstnum!=secondnum));
	
	System.out.println(" Logical operator");
	System.out.println(100 > 65 && 20<5);
	System.out.println(100 < 65 || 20>5);
	
	System.out.println(" Assignment operator");
	int val = 10;
	System.out.println("Initial value " +val);
	System.out.println("after += : "+( val+=5));
	System.out.println("after -= : "+( val-=10));
	System.out.println("after *= : "+( val*=8));
	System.out.println("after /= : "+( val/=2));
	System.out.println("after %= : "+( val%=3));
	
	System.out.println(" Unary operator");
	System.out.println("After increment: "+ (++firstnum));
	System.out.println("After decrement: "+ (--firstnum));
	System.out.println(" post increment: "+ (firstnum++));
	System.out.println("posr decrement: "+ (firstnum--));

	System.out.println(" Conditional operator");
	if ((firstnum%=2)==0) {
		System.out.println("is even");
	} else
		System.out.println("is odd");
	}
	
}

