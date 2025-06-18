import java.util.HashMap;
import java.util.Scanner;

public class EmojiMoodResponder {
    public static void main(String[] args) {

        HashMap<String, String> moodMap = new HashMap<>();
        moodMap.put("happy", "😊 Stay smiling, the world needs more joy!");
        moodMap.put("sad", "😢 It's okay to feel down. Better days are coming!");
        moodMap.put("tired", "😴 Take a break, recharge, and come back stronger.");
        moodMap.put("angry", "😠 Breathe deeply. Let go of what you can't control.");
        moodMap.put("excited", "🤩 Ride the wave of excitement! You've got this!");
        moodMap.put("nervous", "😬 Just breathe. You've prepared more than you know.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your current mood: ");
        String userMood = scanner.nextLine().toLowerCase();


        if (moodMap.containsKey(userMood)) {
            System.out.println("Your emoji & message: " + moodMap.get(userMood));
        } else {
            System.out.println("Mood not found. Try something like: happy, sad, tired, angry, excited.");
        }

        scanner.close();
    }
}

