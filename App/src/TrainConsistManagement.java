import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class TrainConsistManagement {
    public static void main(String [] args){

                // =========================
                // 🔹 Welcome Message
                // =========================
                System.out.println("=== Train Consist Management App (UC6) ===\n");

                // =========================
                // 🔹 Step 1: Create HashMap
                // Key: Bogie Name, Value: Capacity (Seats)
                // =========================
                Map<String, Integer> bogieCapacity = new HashMap<>();

                // =========================
                // 🔹 Step 2: Insert Bogie-Capacity Pairs
                // =========================
                bogieCapacity.put("Sleeper", 72);
                bogieCapacity.put("AC Chair", 54);
                bogieCapacity.put("First Class", 36);

                // =========================
                // 🔹 Step 3: Display Map Using entrySet()
                // =========================
                System.out.println("Bogie Capacities:");

                for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
                    System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
                }

                // =========================
                // 🔹 Step 4: Lookup Example
                // =========================
                String searchBogie = "Sleeper";
                if (bogieCapacity.containsKey(searchBogie)) {
                    System.out.println("\nLookup: " + searchBogie + " has capacity " + bogieCapacity.get(searchBogie) + " seats");
                }

                // =========================
                // 🔹 Program End
                // =========================
                System.out.println("\nSystem ready for next operation...");
            }
        }
