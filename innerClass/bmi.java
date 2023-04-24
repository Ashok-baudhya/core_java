package innerClass;

public class bmi {
    public static void main(String[] args) {
        
        // Parse the command-line arguments
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);
        
        // Calculate the BMI index
        double bmiIndex = weight / (height * height);
        
        if (args.length != 4) {
            System.out.println("Please provide four arguments: First name, Last name, Weight (in kg), Height (in meters)");
            return;
        }
        
        // Print the results
        System.out.printf("%s %s's BMI index is %.2f\n", firstName, lastName, bmiIndex);
    }
}
