package digitextraction;

import java.util.Scanner;

public class Series_Nth_Term
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int  n=sc.nextInt();
        float sum=0.0f;
        for(int i=1;i<=2*n;i+=2)
        {
            sum=sum+((float)i/(i+1));//This concept is known as dynamic casting, where we are upcasting into `float` so that the calculation remains in fraction. 
            System.out.print(i+"/"+(i+1)+"+");
        }
        System.out.println("\nSum is "+sum);
    }
}

