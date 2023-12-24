import java.util.*;
class AP
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first term of the Arithmetic Progression : ");
        int A=sc.nextInt();
        System.out.println("Enter the common difference of the Arithmetic Progression : ");
        int d=sc.nextInt();
        System.out.println("Enter the term of A.P which you want to find : ");
        int n=sc.nextInt();
        int term=A+(n-1)*d;
        System.out.println("The "+ n + "th term of the given sequence is" + term);
    }
}