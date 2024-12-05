package day9;
import java.util.Scanner;
public class Assessment1 {

	/*  AGE VALIDATION
	 void validator(int age){	
		if(age>=18) {
			System.out.println("Eligeble");
		}else{
			System.out.println("Not Eligeble");
		}
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc .nextInt();
		Assessment1 obj = new Assessment1();
		obj.validator(age);
		
	}*/
	
	
	/*4 MULTIPLE
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		for(int i=1;i<=100;i++) {
			if(i%4==0) {
				System.out.println(name);
			}
			else {
				System.out.println(i);
			}
		}
	}
	*/
	
	/*SKIP ODD NUMBER
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER NUMBER: ");
		int num = sc .nextInt();
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	
	}*/
	
	/* ODD OR EVEN
	 public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER NUMBER: ");
		int num = sc .nextInt();	
			if(num%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
	}*/
	
	
	
	/*public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name: ");
		String word = sc.nextLine();
		String upper = word.toUpperCase();
		System.out.println("Upper case: " +upper);
		String lower = word.toLowerCase();
		System.out.println("Lower Case: " +lower);
}*/
	
	
	/*PASS OR FAIL
	
	void grade(int num) {
		if(num>=81&&num<=100) {
			System.out.println("PASS grade A ");
		}
		else if(num>=61 && num<=80)
		{
			System.out.println("PASS grade B ");
		}
		else if(num>=41 && num<=60)
		{
			System.out.println("PASS grade C ");
		}
		else if(num<=40)
		{
			System.out.println("FAIL ");
		}
	}
	
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER MARK: ");
		int num = sc .nextInt();
		Assessment1 result= new Assessment1();
		result.grade(num);
	
}*/
	
	
	/*TOTAL AND AVERAGE

	 int total(int mat, int eng, int sst, int hin, int engl) {
		 return mat+eng+sst+hin+engl;
	 }
	 public static void main(String [] args){
			Scanner sc= new Scanner(System.in);
			System.out.println("ENTER YEAR: ");
			int year = sc.nextInt();
		System.out.println("ENTER MATHS MARK: ");
		int mat = sc .nextInt();
		System.out.println("ENTER ENGLISH MARK: ");
		int engl = sc .nextInt();
		System.out.println("ENTER SOCIAL MARK: ");
		int sst = sc .nextInt();
		System.out.println("ENTER HINDI MARK: ");
		int hin = sc .nextInt();
		System.out.println("ENTER SCIENCE MARK: ");
		int sci = sc .nextInt();
		
		Assessment1 result = new Assessment1();
		int tot= result.total(mat,engl,sst,hin,sci);
		System.out.println("TOTAL: "+tot);
		float avg = tot/5;
		System.out.println("Average: "+avg);

	 } */
	 
	 
	/* LEAP YEAR
	 
	 void leap(int year) {
		if((year %4 == 0) && (year%100!=0 || year%400==0)){
			System.out.println("LEAP YEAR");
		}else {
			System.out.println("NOT LEAP YEAR");
		}
	}
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER YEAR: ");
		int year = sc.nextInt();
		Assessment1 ans=new Assessment1();
		ans.leap(year);
		
	}*/
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	