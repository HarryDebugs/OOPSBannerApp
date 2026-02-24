/**
 * OOPSBannerApp UC4 - Render OOPS as Banner using String Array and Loop
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop.
 * @author Harry
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        
        // 1. Array Creation: Define a String array with a size of 7
        String[] lines = new String[7];
        
        // 2. Array Population: Fill each index of the array using String.join()
        lines[0] = String.join("", "  **** ", " **** ", " ****** ", " **** ");
        lines[1] = String.join("", " * *", " * *", " * * ", " * *");
        lines[2] = String.join("", " * *", " * *", " * * ", " * *");
        lines[3] = String.join("", " * *", " **** ", " ****** ", " **** ");
        lines[4] = String.join("", " * *", " * *", " * ", "      *");
        lines[5] = String.join("", " * *", " * *", " * ", " * *");
        lines[6] = String.join("", "  **** ", " **** ", " * ", "  **** ");
        
        // 3. Loop Iteration: Use an enhanced for-each loop to print each line
        for (String line : lines) {
            System.out.println(line);
        }
    }
}