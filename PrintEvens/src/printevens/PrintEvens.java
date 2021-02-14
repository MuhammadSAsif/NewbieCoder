package printevens;
/**
 * @author msasif
 */
public class PrintEvens {
    public static void main(String[] args) {
     // In line # 8 if even is less than 100, it will keep on incrementing by 1.
        for (int even = 0; even <= 100; even++) {
     // if even divided by 2 gives the remainder zero than print the number.
            if (even % 2 == 0) {
                System.out.println(even); // prints the output.
            }
        }
    }

}
