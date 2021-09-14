FIBO
import java.util.Scanner;

public class Fibo {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n,i=0,a=0,b=1,c=0;
	System.out.println("enter number you wanna create fibonacci series upto");
	n=sc.nextInt();
	if(n==1)
		System.out.println("0");
	else if(n==2)
		System.out.println("0 1");
	else if(n>2) {
		System.out.println("0 1");
		for(i=1;i<=(n-2);i++) {
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
		}
			
	}		
	

}
}
FIBOR
import java.util.Scanner;

public class Fibor {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("enter number you wanna create fibonacci series upto");
		n=sc.nextInt();
		if(n==1)
			System.out.println("0");
		else if(n==2)
			System.out.println("0 1");
		else if(n>2) {
			System.out.println("0 1");
			fib(n,0,1);
			}
				
		}
	public static void fib(int num,int a,int b) {
		while(num>2) {
			System.out.println(""+(a+b));
			fib(--num,b,(a+b));
			num=0;
		}

	}

}
PRIME
import java.util.Scanner;
public class Prime {
public static void main(String args[]) {
	int c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int num=sc.nextInt();
	for(int i=2;i<=num;i++) {
		if(num%i == 0) 
			c++;
		}
	
	if(c==1) 
		System.out.println("Prime Number");
	
	else 
		System.out.println("Not Prime");
	
	}
}
BUBBLE
import java.util.Scanner;
public class bubble {
public static void main (String args[]) {
	int n,i,j,temp;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size");
	n=sc.nextInt();
	int A[]=new int [n];
	for(i=0;i<n;i++) {
		System.out.println("enter elements");
		A[i]=sc.nextInt();
	}
	System.out.println("before sorting");
	for(i=0;i<n;i++) {
		System.out.println(A[i]+"");
	}
	for(i=0;i<n-1;i++)
		for(j=0;j<n-1-i;j++) {
			temp=A[j];
			A[j]=A[j+1];
			A[j+1]=temp;
		}
	System.out.println("after sorting");
	for(i=0;i<n;i++) {
		System.out.println(A[i]+"");
	}
}
}
ACCOUNT
import java.util.*;
public class Account {
	
	int accno;
	String name;
	int phno;
	float bal_amt;
	Scanner sc=new Scanner(System.in);
	
	void getinput() {
		System.out.println("enter acc no");
		accno=sc.nextInt();
		System.out.println("enter name");
		name=sc.next();
		System.out.println("enter phone number");
		phno=sc.nextInt();
		bal_amt=0.0f;
	}
	void deposit() {
		System.out.println("enter the amount you want to deposit");
		float amt=sc.nextFloat();
		bal_amt+=amt;
	}
	void withdraw() {
		System.out.println("enter the amount you want to withdraw");
		float amt=sc.nextFloat();
		if(bal_amt<amt) {
			System.out.println("insufficient balance");
		}
		else
		bal_amt-=amt;
	}
	void display() {
		System.out.println("Name"+name);
		System.out.println("phone number"+phno);
		System.out.println("account number"+accno);
		System.out.println("balance amount"+bal_amt);
	}
	public static void main(String args[]) {
		Account ob=new Account();
		System.out.println("enter details");
		ob.getinput();
		int ch;
		do{
			System.out.println("1.Deposit 2.Withdraw 3.Display 4.Exit");
			System.out.println("enter choice");
			 ch=ob.sc.nextInt();
		switch(ch) {
		
		case 1:System.out.println("Deposit");
				ob.deposit();
				break;
		case 2:System.out.println("withdraw");
				ob.withdraw();
				break;
		case 3:System.out.println("display");
				ob.display();
				break;
		case 4:System.out.println("exit");
				break;
		default:System.out.println("invalid choice");
		}
		}while(ch!=4);
	}	
}
STACKS
import java.util.Scanner;
public class Stacks {
int size;
int top;
int stacks[];
Stacks(int size,int top){
	this.size=size;
	this.top=top;
	this.stacks=new int[size];
	
}
public void push(int ele) {
	if(top==size-1) {
		System.out.println("Stackoverflow");
	}
	else
		stacks[++top]=ele;
		System.out.println("element added successfully");
}
public int pop() {
	if(top==-1) {
		return -1;
		
	}
	else
		return stacks[top--];
}
public void display() {
	if(top==-1) {
		System.out.println("the stack is empty");
	
	}
	else {
		System.out.println("the elements are");
		for(int i=top;i>=0;i--) {
			
			System.out.println(stacks[i]+"");
		}
	}
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size");
	int size=sc.nextInt();
	Stacks ob =new Stacks(size,-1);
	System.out.println("1.push");
	System.out.println("2.pop");
	System.out.println("3.display");
	System.out.println("4.exit");
	while(true) {
		System.out.println("enter choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:System.out.println("enter element");
				int ele1=sc.nextInt();
				ob.push(ele1);
				break;
		case 2: int ele2=ob.pop();
				if(ele2!=-1) {
					System.out.println("element popped"+ele2);
				}
				else
				{
					
					System.out.println("Stack underflow");
					
				}
				break;
		case 3: ob.display();
				break;
		case 4: System.exit(0);
				break;
		default:System.out.println("invalid choice");
		}
	}
}
}
COMPLEX
import java.util.*;
public class Complex {
	double r1,r2,i1,i2;
	Scanner sc=new Scanner(System.in);
Complex(){
	r1=+0.0;
	r2=+0.0;
	i1=+0.0;
	i2=+0.0;
}
void add() {
	System.out.println("The sum is"+(r1+r2)+"+("+(i1+i2)+")i");
}
void diff() {
	System.out.println("the difference is"+(r1-r2)+"+("+(i1-i2)+")i");
}
void mul() {
	System.out.println("the product is"+(r1*r2-i1*i2)+"+("+(r1*i2+r2*i1)+")i");
}

public static void main(String args[]) {
	Complex ob=new Complex();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first real and imaginary");
	ob.r1=sc.nextInt();
	ob.i1=sc.nextInt();
	System.out.println("enter second real and imaginary");
	ob.r2=sc.nextInt();
	ob.i2=sc.nextInt();
	System.out.println("1.ADD 2.SUB 3.MUL 4.EXIT");
	System.out.println("entr choice");
	int ch=sc.nextInt();
	switch(ch) {
	
	case 1:ob.add();
		  break;
	case 2:ob.diff();
	  break;
	case 3:ob.mul();
	  break;
	case 4 :System.exit(0);
	  break;
	default:System.out.println("invalid choice");
	}
}
}
MATRICES
import java.util.*;
class product {
int i,j,k, m,n,A[][];
Scanner sc=new Scanner(System.in);
product(){
	System.out.println("enter no of rows and columns");
	 m=sc.nextInt();
	 n=sc.nextInt();
	 A=new int[m][n];
}
product(product ob1,product ob2) {
	m=ob1.m;
	n=ob2.n;
	A=new int[m][n];
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			A[i][j]=0;
			for(k=0;k<ob2.m;k++) {
				A[i][j]+=ob1.A[i][k]*ob2.A[k][j];
			}
		}
	}
}
void input() {
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			System.out.println("enter elements");
			A[i][j]=sc.nextInt();
}
	}
	
}
void display() {
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			System.out.println(A[i][j]+"");
			System.out.println();
		}
}
}
public static void main(String args[]) {
	product ob1=new product();
	product ob2=new product();
	if(ob1.n==ob2.m) {
	System.out.println("enter 1st mat");
	ob1.input();
	System.out.println("enter 2nd mat");
	ob2.input();
	product ob3=new product(ob1,ob2);
	System.out.println("first matrice");
	ob1.display();
	System.out.println("second matrice");
	ob2.display();
	System.out.println("product matrice");
	ob3.display();
}
	else {
		System.out.println("multi not possible");
	}
	}
}

STRINGS
import java.util.*;
public class strings {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.extract");
	System.out.println("2.extract");
	System.out.println("3.extract");
	System.out.println("4.extract");
	System.out.println("5.extract");
	System.out.println("6.extract");
	System.out.println("enter choice");
	int ch=sc.nextInt();
	switch(ch) {
	case 1:System.out.println("enter string");
			String s=sc.next();
			System.out.println("enter pos where you wanna extract from");
			int n=sc.nextInt();
			System.out.println("enter amount of characters u wanna extract from");
			int m=sc.nextInt();
			String k=s.substring(n-1,m+n-1);
			System.out.println("Extracted"+k);
			break;
	case 2:System.out.println("enter string");
			s=sc.next();
			System.out.println("enter the word you wanna find occurences for");
			k=sc.next();
			int counter=0;
			String arr[]=s.split("");
			for(int i=0;i<arr.length;i++) {
				if(arr[i].equals(k)) {
				counter++;
				}
			}
			System.out.println("the number of occurences"+counter);
		break;
	case 3:System.out.println("enter string");
			s=sc.next();
			System.out.println("enter string you wanna replace");
			k=sc.next();
			System.out.println("enter string you wanna replace with");
			String p=sc.next();
			String c=s.replace(k, p);
			System.out.println("replaced string"+c);
			break;
	case 4:System.out.println("enter string");
			s=sc.next();
			k=s.toLowerCase();
			char arr2[]=k.toCharArray();
			Arrays.sort(arr2);
			p=new String(arr2);
			System.out.println("alpabetical"+p);
			break;
	case 5:System.out.println("enter string");
			s=sc.next();
			System.out.println("enter string");
			k=sc.next();
			boolean cmp=s.equalsIgnoreCase(k);
			if(cmp) {
				System.out.println("equal");
			}
				else {
					System.out.println("not equal");
				}
			break;
	case 6:System.out.println("enter string ");
			k=sc.next();
			System.out.println("enter string ");
			s=sc.next();
			p=k.concat(s);
			System.out.println("concat"+p);
			break;
	default:System.out.println("invalid");
			}
			
			
	}
}

PERSONAL
Employee.java:
package Personal;

class Salary{
	float da,hra,basic,total;
	Salary(float basic){
		this.basic=basic;
		hra=(float)(basic*0.4);
		da=(float)(basic*0.6);
		total=(hra+da+basic);
	}
}
public class Employee{
	String name,education;
	int yearsofexp,noofloans,loanamt,age,basic,tax;
	Salary salary;
	Employee(String name,int age,String education,int yearsofexp,int noofloans,int loanamt,int basic){
		this.basic=basic;
		this.education=education;
		this.name=name;
		this.age=age;
		this.yearsofexp=yearsofexp;
		this.noofloans=noofloans;
		this.loanamt=loanamt;
		salary=new Salary(basic);
	}
void isEligible() {
	if((loanamt<=salary.total/2)&&(noofloans<5)) {
		System.out.println("Eligible for loan");
	}
		else {
			System.out.println("not eligible");
		}
	}
void taxPay() {
	if(salary.total<250000) {
		tax=0;
	}
	else if((salary.total>250000)&&(salary.total<5000000)) {
		tax=(int)(0.1*salary.total);
	}
}
void isEligiblePromotion() {
	if(yearsofexp>10) {
		System.out.println("promotion eligible");
		
	}
	else {
		System.out.println("no promotion eligible");
	}
}
void Display() {
	System.out.println("name: " + name);
	System.out.println("age :" + age);
	System.out.println("education :" + education);
	System.out.println("Years of Experience: " + yearsofexp);
	System.out.println("Number of Loans: " + noofloans);
	System.out.println("Salary: " + salary.total);
	isEligible();
	System.out.println("The tax to be paid is " + tax);
	isEligiblePromotion();
	System.out.println("\n\n\n");
}
}
EmployeeDriver.java:
package Personal;


import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employees to be created");
		int num = sc.nextInt();
		Employee employees[] = new Employee[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the information for employee number "+(i+1));
			System.out.println("Enter the name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the age");
			int age = sc.nextInt();
			System.out.println("Enter Education");
			sc.nextLine();
			String education = sc.nextLine();
			System.out.println("Enter years of experience");
			int yearsofexp = sc.nextInt();
			System.out.println("Enter number of Loans");
			int noofloans = sc.nextInt();
			System.out.println("Enter the basic salary");
			int basic = sc.nextInt();
			System.out.println("Enter the loan amount");
			int loanAmount = sc.nextInt();
			employees[i] = new Employee(name, age, education, yearsofexp, noofloans, basic, loanAmount);
		}
		for (int j = 0; j < num; j++) {
			System.out.println("This is employee number "+(j+1)+"'s Information");
			employees[j].Display();
			System.out.println("\n\n\n");
		}
		
	}

}
CIRCLE
import java.util.*;
public class Circle {
double r;
Circle(double r){
	this.r=r;
}
double area() {
	return Math.PI*Math.pow(r, 2);
	
}
}
class Sector extends Circle{
	double ctr_ang;
Sector(double r,double ctr_ang){
	super(r);
	this.ctr_ang=Math.toRadians(ctr_ang);
}
double area() {
	return 0.5*Math.pow(r, 2)*ctr_ang;
}
}
class Segment extends Circle{
	double h;
Segment(double r,double h){
	super(r);
	this.h=h;
}
double area() {
	return Math.abs((Math.pow(r, 2)*Math.toRadians((r-h)/r))-((r-h)*Math.sqrt((2*r*h)-Math.pow(h, 2))));
	}
}
class Compute{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius");
		double r=sc.nextDouble();
		Circle ob1=new Circle(r);
		System.out.println("enter angle");
		double ctr_ang=sc.nextDouble();
		Sector ob2=new Sector(r,ctr_ang);
		System.out.println("enter length of segment");
		double h=sc.nextDouble();
		Segment ob3=new Segment(r,h);
		System.out.println("Area of Circle"+ob1.area());
		System.out.println("Area of Sector"+ob2.area());
		System.out.println("Area of Segment"+ob3.area());
	}
}
VEHICLE

import java.util.Scanner;
abstract class Vehiclee
{
    Scanner sc = new Scanner(System.in);
    int year_of_manufacture,m,sp;
    abstract void getData();
    abstract void putData();
    Vehiclee()
    {
        year_of_manufacture=0;
    }
}
class TwoWheeler extends Vehiclee
{
    void getData()
    {
        System.out.println("Enter the year of manufacture");
        year_of_manufacture = sc.nextInt();
        System.out.println("Enter the mileage in Km/L");
        m = sc.nextInt();
        System.out.println("Enter the top speed in Km/Hr");
        sp = sc.nextInt();
    }
    void putData()
    {
        System.out.println("Year of manufacture : "+year_of_manufacture);
        System.out.println("Mileage : "+m+"Km/L");
        System.out.println("Top Speed : "+sp+"Km/Hr");
    }
}
final class FourWheeler extends Vehiclee
{
    void getData()
    {
        System.out.println("Enter the year of manufacture");
        year_of_manufacture = sc.nextInt();
        System.out.println("Enter the mileage in Km/L");
        m = sc.nextInt();
        System.out.println("Enter the top speed in Km/Hr");
        sp = sc.nextInt();
    }
    void putData()
    {
        System.out.println("Year of manufacture : "+year_of_manufacture);
        System.out.println("Mileage : "+m+"Km/L");
        System.out.println("Top Speed : "+sp+"Km/Hr");
    }
}
class MyTwoWheeler extends TwoWheeler
{
    {
        super.getData();
        super.putData();
    }
}
class Drive
{
    public static void main(String args[])
    {
        MyTwoWheeler ob = new MyTwoWheeler();
    }
}
ARRAYLIST
import java.util.*;
public class Queue
{
    ArrayList<String> alist = new ArrayList<>();
    void insert(String s)
    {
        alist.add(s);
    }
    void delete()
    {
        if (alist.isEmpty())
            System.out.println("UNDERFLOW");
        else {
            System.out.println("String deleted is " + alist.get(0));
            alist.remove(0);
        }
    }
    void display()
    {
        if (alist.isEmpty())
            System.out.println("UNDERFLOW");
        else
            System.out.println(alist);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Queue ob = new Queue();
        int ch;
        while (true)
        {
            System.out.println("Press 1 to insert\nPress 2 to delete\nPress 3 to display\nPress 4 to exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1: System.out.println("Enter a string");
                        sc.nextLine();
                        ob.insert(sc.nextLine());
                        break;
                case 2: ob.delete();
                        break;
                case 3: ob.display();
                        break;
                case 4: System.exit(0);
                default:System.out.println("Incorrect choice");
            }
        }
    }
}
LINKEDLIST
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

class LinkedList1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<String>();

        while(true){
            System.out.println("1. Insert an element into the linked list");
          
            System.out.println("2. List all elements with length less than 5");
            System.out.println("3. Display the LinkedList");
            System.out.println("4. Exit!");

            System.out.print("Enter your choice:\t");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                        System.out.println("Enter the element to be inserted");
                        String x = sc.next();
                        ll.add(x);
                        System.out.println("Element inserted successfully");
                        break;
                
                case 2:
                        if(ll.peek() == null){
                            System.out.println("The Linked list is empty");
                        }
                        else{
                            Iterator<String> itr = ll.iterator();
                            String e1 = "";
                            System.out.println("The strings with length less than 5 are: ");
                            while(itr.hasNext()){
                                e1 = itr.next();
                                if(e1.length()<5){
                                    System.out.println(e1);
                                }
                            }
                        }
                        break;
                case 3:
                        if(ll.peek() == null){
                            System.out.println("The linked list is empty");
                        }
                        else{
                            Iterator<String> itr = ll.iterator();
                            System.out.println("The elements of the linked list are:");
                            while(itr.hasNext()){
                                System.out.println(itr.next());
                            }
                        }
                        break;
                case 4:
                        System.exit(0);
                        break;
                default:
                        System.out.println("Invalid choice");
                    
            }
        }
    }
}


