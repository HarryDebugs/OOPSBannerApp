/**
 * OOPSBannerApp UC3 - OOPS Banner Application
 * * This class extends the functionality of Use Case 2 by utilizing the String.join() 
 * method to create each line of the banner, overcoming the inefficiency of the + operator.
 * * @author Harry Jay William
 * @version 3.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        // Construct each line using String.join() for better readability and efficiency
        System.out.println(String.join("", "  **** ", " **** ", " ****** ", " **** "));
        System.out.println(String.join("", " * *", " * *", " * * ", " * *"));
        System.out.println(String.join("", " * *", " * *", " * * ", " * *"));
        System.out.println(String.join("", " * *", " **** ", " ****** ", " **** "));
        System.out.println(String.join("", " * *", " * *", " * ", "      *"));
        System.out.println(String.join("", " * *", " * *", " * ", " * *"));
        System.out.println(String.join("", "  **** ", " **** ", " * ", "  **** "));
    }
}