import java.util.Random;
import java.util.Scanner;

public class FakeJobTitleGenerator {
    public static void main(String[] args) {
        // Arrays with parts of fake job titles
        String[] adjectives = {
            "Senior", "Global", "Lead", "Dynamic", "Visionary",
            "Corporate", "Strategic", "Forward-thinking"
        };

        String[] roles = {
            "Solutions", "Integration", "Optimization", "Synergy", "Branding",
            "Infrastructure", "Paradigm", "Analytics"
        };

        String[] positions = {
            "Architect", "Engineer", "Coordinator", "Manager",
            "Designer", "Consultant", "Specialist", "Executive"
        };

        // Create Random object
        Random random = new Random();

        // Input: number of job titles to generate
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many fake job titles would you like to generate? ");
        int count = scanner.nextInt();

        System.out.println("\nGenerating " + count + " fake job titles...\n");

        // Loop to generate job titles
        for (int i = 1; i <= count; i++) {
            String adjective = adjectives[random.nextInt(adjectives.length)];
            String role = roles[random.nextInt(roles.length)];
            String position = positions[random.nextInt(positions.length)];

            String jobTitle = String.format("%s %s %s", adjective, role, position);
            System.out.println(i + ". " + jobTitle);
        }

        scanner.close();
    }
}