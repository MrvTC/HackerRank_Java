import java.util.Scanner;

public class JavaDatatypes {


    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        int sayi1=sc.nextInt();

        if (sayi1==-150){

            System.out.println("-150 can be fitted in:\n" +
                    "* short\n" +
                    "* int\n" +
                    "* long");

        }
















    }














}
