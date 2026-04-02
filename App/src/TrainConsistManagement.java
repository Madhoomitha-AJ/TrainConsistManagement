import java.util.Set;
import java.util.HashSet;
public class TrainConsistManagement {
    public static void main(String [] args){


                // 🔹 Step 1: Start program
                System.out.println("=== Train Consist Management App (UC3) ===");

                // 🔹 Step 2: Create HashSet for bogie IDs
                Set<String> bogieIds = new HashSet<>();

                // 🔹 Step 3: Add bogie IDs (including duplicates)
                bogieIds.add("B101");
                bogieIds.add("B102");
                bogieIds.add("B103");
                bogieIds.add("B101"); // duplicate
                bogieIds.add("B102"); // duplicate

                // 🔹 Step 4: Print final set
                System.out.println("Final Bogie IDs (duplicates removed automatically):");
                System.out.println(bogieIds);

                // 🔹 Program continues
                System.out.println("System ready for next operation...");
            }
        }