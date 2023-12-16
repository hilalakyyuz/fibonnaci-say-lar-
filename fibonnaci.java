package calisma1;

import java.util.Scanner;

public class fibonnaci {
	
	public static void yaz(int gelen)//metod
{
	System.out.println(gelen);
}

public static int okuInt()
{
 Scanner klavye=new Scanner(System.in);
 return klavye.nextInt();
}
public static void yaz(String gelen)//metod
{
	System.out.println(gelen);
}
public static int fibonnacci(int terim) 
{
	 int s1,s2,s3=0;
	 s1=0;
	 s2=1;
	 for(int i=1;i<terim;i++)
	 {
	    
	    s3=s1+s2;
	    s1=s2;
	    s2=s3;
	 }
	 return s3;
}
public static int fib (int terim) {
	
	 if (terim<=1)
		return terim;
	 else return fib(terim-1)+fib(terim-2);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Fibonnacci 0 1 1 2 3 5 8 13 21 34 55 89 ...
		 //           s1 s2 s2
		 
		 int terim=8;
		 int sonuc=0;
		 
		 
	    yaz("fibonnaci serisinin kaçıncı terimini istiyorsun? :");
		terim=okuInt();
		 
		sonuc=fib(terim);

		 
		 yaz("fibonnaci serisinin "+terim+".terimi:"+sonuc+"dir.");
		 
		 }

	}


