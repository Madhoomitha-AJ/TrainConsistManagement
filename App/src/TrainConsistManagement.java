import java.util.ArrayList;
import java.util.List;
public class TrainConsistManagement {
    public static void main(String [] args){
                // 🔹 Step 1: User runs program
                System.out.println("=== Train Consist Management App ===");

                // 🔹 Step 2: Initialize ArrayList
                List<String> passengerBogies = new ArrayList<>();

                // 🔹 Step 3: Add bogies (CREATE)
                passengerBogies.add("Sleeper");
                passengerBogies.add("AC Chair");
                passengerBogies.add("First Class");

                // 🔹 Step 4: Display bogies (READ)
                System.out.println("Bogies after addition: " + passengerBogies);

                // 🔹 Step 5: Remove a bogie (DELETE)
                passengerBogies.remove("AC Chair");
                System.out.println("After removing AC Chair: " + passengerBogies);

                // 🔹 Step 6: Check existence (READ)
                boolean exists = passengerBogies.contains("Sleeper");
                System.out.println("Does Sleeper exist? " + exists);

                // 🔹 Step 7: Final list state
                System.out.println("Final bogie list: " + passengerBogies);

                // 🔹 Program continues
                System.out.println("System ready for next operation...");
            }
        }