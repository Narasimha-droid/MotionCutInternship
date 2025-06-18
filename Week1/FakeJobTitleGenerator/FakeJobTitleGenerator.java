import java.util.Random;
import java.util.Scanner;

public class FakeJobTitleGenerator {
    public static void main(String[] args) {

        String[] adjectives = {"Quantum", "Digital", "Virtual", "Agile", "Dynamic", "Innovative", "Futuristic", "Magnetic"};
        String[] jobRoles = {"Marketing Ninja", "Data Wizard", "Synergy Officer", "Cloud Whisperer", "Blockchain Evangelist", "AI Consultant", "Growth Hacker"};

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String answer;

        do {

            String adjective = adjectives[random.nextInt(adjectives.length)];
            String role = jobRoles[random.nextInt(jobRoles.length)];

            String fakeTitle = adjective + " " + role;
            System.out.println("Your Fake Job Title: " + fakeTitle);

            System.out.print("Do you want another one? (yes/no): ");
            answer = scanner.nextLine().toLowerCase();
        } while (answer.equals("yes"));

        scanner.close();
    }
}
