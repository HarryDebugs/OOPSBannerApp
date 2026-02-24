/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 * This use case extends UC4 by defining and populating the String array in a more
 * concise way at the time of declaration using String.join().
 * @author Harry Jay William
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        
        // Define and populate the String array at the time of declaration
        String[] lines = {
            String.join("", "  **** ", " **** ", " ****** ", " **** "),
            String.join("", " * *", " * *", " * * ", " * *"),
            String.join("", " * *", " * *", " * * ", " * *"),
            String.join("", " * *", " **** ", " ****** ", " **** "),
            String.join("", " * *", " * *", " * ", "      *"),
            String.join("", " * *", " * *", " * ", " * *"),
            String.join("", "  **** ", " **** ", " * ", "  **** ")
        };
        
        // Use an enhanced for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}