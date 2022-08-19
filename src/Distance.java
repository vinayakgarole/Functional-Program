import java.util.Scanner;
public class Distance {
        public static void main(String[] args) {

            int x,y;
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            System.out.println("Enter a First Value :");
            y = sc.nextInt();
            System.out.println("Enter a Second Value :");

            double dist = Math.sqrt(x*x + y*y);

            System.out.println("Distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
        }
    }

