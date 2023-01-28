import java.util.Scanner;

public class JavaLoops02 {

    /*

      We use ,a=0 ,b=2 and n=10  to produce some series :

  s0= 0 + 1*2 = 2

  s1 = 0 + 1*2 + 2*2 =6

  s3 = 0 +  1*2 + 2*2 + 4*2 = 14

  ... and so on.

  Once we hit , we print the first ten terms as a single line of space-separated integers.

     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int q = in.nextInt();

        int a=in.nextInt();

        int b=in.nextInt();

        int sum=a;

        for(int i=0;i<q;i++){

            sum +=(int)Math.pow(2,i)*b;

            System.out.print(sum+ " ");

        }
    }
}

