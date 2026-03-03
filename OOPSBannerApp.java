/**
 * OOPSBannerApp is the foundational class for the OOPS Banner App project.
 * This Use Case 2 (UC2) implementation prints the literal text "OOPS" 
 * as a stylized ASCII art banner composed of asterisks and spaces.
 * It demonstrates manual string concatenation and sequential print statements.
 *
 * @author bhaveshsingh3783-svg
 * @version 2.0
 */
public class OOPSBannerApp {

    /**
     * The main method serves as the application's entry point.
     * It uses the static keyword and sequential Method Invocations via 
     * System.out.println() to print a 7-line grid forming the text "OOPS".
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        System.out.println("  ***     ***   ****    **** ");
        System.out.println(" *   *   *   *  *   *  *     ");
        System.out.println(" *   *   *   *  *   *  *     ");
        System.out.println(" *   *   *   *  ****    ***  ");
        System.out.println(" *   *   *   *  *          * ");
        System.out.println(" *   *   *   *  *          * ");
        System.out.println("  ***     ***   *      ****  ");
    }
}
