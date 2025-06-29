import java.util.*;

public class ColorMeaningChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> colorMap = new HashMap<>();

        // Predefined color meanings
        colorMap.put("Red", "Symbolizes passion, energy, and love.");
        colorMap.put("Blue", "Represents calm, trust, and intelligence.");
        colorMap.put("Green", "Stands for nature, growth, and harmony.");
        colorMap.put("Yellow", "Associated with happiness, energy, and optimism.");
        colorMap.put("Black", "Symbolizes power, elegance, and mystery.");
        colorMap.put("White", "Represents purity, simplicity, and peace.");

        while (true) {
            System.out.println("\nOptions: [1] Check color [2] Add color [3] View all [4] Exit");
            System.out.print("Choose an option: ");
            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter color name: ");
                    String color = sc.nextLine().trim();
                    if (colorMap.containsKey(color)) {
                        System.out.println(color + ": " + colorMap.get(color));
                    } else {
                        System.out.println("❌ Color not found. Try again.");
                    }
                    break;

                case "2":
                    System.out.print("Enter new color: ");
                    String newColor = sc.nextLine().trim();
                    System.out.print("Enter meaning for " + newColor + ": ");
                    String meaning = sc.nextLine().trim();
                    colorMap.put(newColor, meaning);
                    System.out.println("✅ Color added successfully.");
                    break;

                case "3":
                    System.out.println("Available Colors:");
                    for (String c : colorMap.keySet()) {
                        System.out.println("- " + c);
                    }
                    break;

                case "4":
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
