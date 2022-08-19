import java.util.*;
public class WindChill {
    public static void main(String[] args) {

        int t,v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Value :");
        t = sc.nextInt();
        System.out.println("Enter a Second Value :");
        v = sc.nextInt();


        double windChillTemp = 35.74 + 0.6215 * t +
                (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println(windChillTemp);

    }
}

