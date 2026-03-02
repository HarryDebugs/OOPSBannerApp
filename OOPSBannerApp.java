/**
 * OOPSBannerApp UC6 - Refactor Banner Logic into Functions
 * @author Harry Jay William
 * @version 6.0
 */
public class OOPSBannerApp {

    // Helper method for 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  **** ", " * *", " * *", " * *", " * *", " * *", "  **** "
        };
    }

    // Helper method for 'P'
    public static String[] getPPattern() {
        return new String[] {
            " **** ", " * * ", " * * ", " **** ", " * ", " * ", " * "
        };
    }

    // Helper method for 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  **** ", " * ", " * ", "  **** ", "      *", "      *", " **** "
        };
    }

    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        for (int i = 0; i < oPattern.length; i++) {
            // Manually assemble O-O-P-S line by line
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}