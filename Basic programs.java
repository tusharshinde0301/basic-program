package basic;
import java.util.Scanner;
public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int n1,n2;
		System.out.println("Enter two numbers: ");
		Scanner S=new Scanner(System.in);
		n1=S.nextInt();
		n2=S.nextInt();
		if(n1>n2)
		{
			System.out.println("number 1 is max");
		}
		else
		{
			System.out.println("number 2 is max");
		}*/
		/*int year;
		System.out.println("Enter Year: ");
		Scanner S=new Scanner(System.in);
		year=S.nextInt();
		if(year%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}*/
		
		/*for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}*/
		
		/*for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
		}*/
		
		//Even number 
		
	/*	for(int i=2;i<=100;i+=2)
		{
			System.out.println(i);
		}*/
		
		//sum of 1 to 20 numbers
		/*int i,sum=0;
		for(i=1;i<=20;i++)
		{
		  sum=sum+i;
		  
		}System.out.println(sum);*/
		
		//factorial using while loop
		
		/*int n,fact=1;
		System.out.println("Enter any number: ");
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		System.out.println("Factorial of given number is: " +fact);*/
		
		
		//calculate power of number
		
		/*int b,e,p=1;
		System.out.println("Enter base and exponant: ");
		Scanner S=new Scanner(System.in);
		b=S.nextInt();
		e=S.nextInt();
		while(e>0)
		{
			p=p*b;
			e--;
		}
		System.out.println("Power : "+p);*/
		
		//print multiplication table of any number
		
		/*int n,i=1;
		System.out.println("Enter any number: ");
		Scanner S=new Scanner (System.in);
		n=S.nextInt();
		while(i<=10)
		{
			System.out.println(n*i);
			i++;
		}*/
		
		//Print 1 to 15 multiplication table
		/*int i,j,n;
		for(i=1;i<=10;i++)
		{   n=i;
			for(j=1;j<=15;j++)
			{
				System.out.println(n*j);
			}
			System.out.println("\n");
		}*/
		
		//Count digit
		/*int num,count=0;
		System.out.println("Enter the numbers: ");
		Scanner S=new Scanner(System.in);
		num=S.nextInt();
		while(num>0)
		{
			num=num/10;
			count++;
		}System.out.println("Count= "+count);*/
		
		//sum of digits
		/*int num,sum=0,rem;
		System.out.println("Enter any numbers: ");
		Scanner S=new Scanner(System.in);
		num=S.nextInt();
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem;
		}System.out.println("Sum of Digits= "+sum);*/
		
		
		//Reverse number
		/*int num,rem,rev=0;
		System.out.println("Enter any number: ");
		Scanner S=new Scanner(System.in);
		num=S.nextInt();
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			rev=rev*10+rem;
		}System.out.println("Reverse Numbers are: "+rev);*/
		
		//prime or not prime number
		
		/*int num,i,flag=0;
		System.out.println("Enter any number: ");
		Scanner S=new Scanner(System.in);
		num=S.nextInt();
		for(i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}if(flag==0)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
		*/
		
		// print array in reverse order
		 /*int count=4;
		while(count>=0)
		{
			System.out.println(count);
			count--;
		}
		*/
		/*int marks[]= {10,20,30,40,50};
		for(int count=1;count<marks.length;count++)
		{
			System.out.println(marks[count]);
		}
		*/
		//max number among threee
		
		/*int n1,n2,n3;
		System.out.println("Enter Three numbers: ");
		Scanner S=new Scanner(System.in);
		n1=S.nextInt();
		n2=S.nextInt();
		n3=S.nextInt();
		if(n1>n2 && n1>n3)
		{
			System.out.println("number 1 is max");
		}
		else if(n2>n1 && n2>n3)
		{
			System.out.println("number 2 is max");
		}
		else
		{
			System.out.println("number 3 is max");
		}*/
		
		//given character vowel or consonant
		
		/*char ch;
		System.out.println("Enter any charater: ");
		Scanner S=new Scanner(System.in);
		ch=S.next().charAt(0);
		if((ch=='a')||(ch=='i')||(ch=='o')||(ch=='e')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("Consonant");
		}*/
		
		//Write a program to print values from 1 to entered number.
		/*int num,i=1;
		System.out.println("Enter any number: ");
		Scanner S=new Scanner(System.in);
		num=S.nextInt();
		while(i<=num)
		{
			System.out.println(i);
			i++;
		}*/
		
		//Reverse String
		
		/*char ch;
		String str="Tushar" ,nstr="";
		System.out.println("Original String=Tushar");
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
		}
		System.out.println("Reverse String="+nstr);
		*/
		

	}

}
