import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        sayHello();
        askForName();
         String name = input.nextLine();
        welcomeName(name);
        askForHowOld();
        int age = input.nextInt();
        askForlength();
        double length = input.nextDouble();
        // Ask for weight
        askForWeight();
        int weight = input.nextInt();
        input.nextLine(); // Consume the newline character left by input.nextInt()
        askForAdress();
        String address = input.nextLine();
        askForCountryOfBirth();
        String countryOfBirth = input.nextLine();
        printPatientInfo(name, age, length, weight, address, countryOfBirth);


    }











    // Psuedokod

    //  Säg hej
    static void sayHello() {
        System.out.println("Hello! :)");
    }
//fråga användaren om namn
    static void askForName() {

        System.out.println("What's your name?: ");
    }
// Välkomna användaren
    static void welcomeName(String name) {


        System.out.println("Welcome " + name);
    }
// fråga om ålder
    static void askForHowOld() {
        System.out.println("How old are you?: ");
    }

    // fråga om längd
    static void askForlength() {
        System.out.println("How tall are you? Please answer in cm : ");
    }
// Fråga om vikt
    static void askForWeight() {

        System.out.println("How much do you weigh? (IN KGs): ");

    }


    // adreess
    static void askForAdress() {
        System.out.println("What's your adress?: ");
    }
    // Födelseland
    static void askForCountryOfBirth() {
        System.out.println("Where are you born? ");
}

// Visa patient info meny, fick menyn av chatgpt.
    private static void printPatientInfo(String name, int age, double length,int  weight,String  address,String countryOfBirth) {
        // Top row
        System.out.println("+----------Patient info----------");

        // Name row
        System.out.println("| Name: " + name + generateSpaces(29 - name.length()) + "|");

        // Age row
        System.out.println("| Age: " + age + generateSpaces(30 - String.valueOf(age).length()) + "|");

        // Height row
        System.out.println("| Height: " + length + " cm" + generateSpaces(25 - String.valueOf(length).length()) + "|");

        // Weight row
        System.out.println("| Weight: " + weight + " kg" + generateSpaces(26 - String.valueOf(weight).length()) + "|");

        // Address row
        System.out.println("| Address: " + address + generateSpaces(26 - address.length()) + "|");

        // Country of Birth row
        System.out.println("| Country of Birth: " + countryOfBirth + generateSpaces(16 - countryOfBirth.length()) + "|");

        // Bottom row
        System.out.println("+-------------------------------+");
    }

    public static String generateSpaces(int numSpaces) {
        String spaces = "";
        for (int i = 0; i < numSpaces; i++) {
            spaces += " ";
        }
        return spaces;
    }
// SLut på menyn


}