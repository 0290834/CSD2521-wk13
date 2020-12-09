import java.util.Scanner;
/**
 * 
 * @author Gregory Spain
 */
public class NameParserApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object
        
        // create constants
        final String FIRST_NAME = "First name: ";
        final String MIDDLE_NAME = "Middle name: ";
        final String LAST_NAME = "Last name: ";
        
        System.out.print("Enter a name: "); // prompt user
        String name = sc.nextLine(); // get name
        System.out.println();
        
        name = name.trim(); // trim spaces
        String[] nameArray = name.split(" "); // create array of name values
        
        // use a while loop to check length
        while (nameArray.length < 2 || nameArray.length > 3) {
            System.out.println("Error! Must include (only) first name, last "
                    + "name, and optional middle name or inital. Try again.");
            System.out.print("Enter a name: "); // prompt user
            name = sc.nextLine(); // get name
            name = name.trim(); // trim spaces
            nameArray = name.split(" "); // create array of name values
            System.out.println();
        } // display values using if loops
        if (nameArray.length == 2) {
            System.out.println(FIRST_NAME + "\t" + nameArray[0]);
            System.out.println(LAST_NAME + "\t" + nameArray[1]);
        } else if (nameArray.length == 3) {
            System.out.println(FIRST_NAME + "\t" + nameArray[0]);
            System.out.println(MIDDLE_NAME + "\t" + nameArray[1]);
            System.out.println(LAST_NAME + "\t" + nameArray[2]);
        }
        String s1 = "Kristine";
        s1 += " Thomas";
        String s2 = s1;
        if (s1.equals(s2)) {
            System.out.println("same");
        }
        if (s1 == s2) {
            System.out.println("equal");
        }
    }
}
