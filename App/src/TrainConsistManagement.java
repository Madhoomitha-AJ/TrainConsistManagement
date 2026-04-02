import java.util.Set;
import java.util.HashSet;
import java.util.*;
public class TrainConsistManagement {
    public static void main(String [] args){
                System.out.println("=== Train Consist Management App ===\n");

                // =========================
                // 🔹 UC1: Initialization
                // =========================
                System.out.println("---- UC1: Initialization ----");

                List<String> bogies = new ArrayList<>();
                System.out.println("Train consist initialized.");
                System.out.println("Initial bogie count: " + bogies.size());


                // =========================
                // 🔹 UC2: ArrayList Operations
                // =========================
                System.out.println("\n---- UC2: ArrayList Operations ----");

                bogies.add("Sleeper");
                bogies.add("AC Chair");
                bogies.add("First Class");

                System.out.println("After adding bogies: " + bogies);

                bogies.remove("AC Chair");
                System.out.println("After removing AC Chair: " + bogies);

                boolean exists = bogies.contains("Sleeper");
                System.out.println("Does Sleeper exist? " + exists);

                System.out.println("Final bogie list: " + bogies);


                // =========================
                // 🔹 UC3: HashSet (Uniqueness)
                // =========================
                System.out.println("\n---- UC3: HashSet (Unique Bogie IDs) ----");

                Set<String> bogieIds = new HashSet<>();

                bogieIds.add("B101");
                bogieIds.add("B102");
                bogieIds.add("B103");
                bogieIds.add("B101"); // duplicate
                bogieIds.add("B102"); // duplicate

                System.out.println("Unique Bogie IDs: " + bogieIds);


                // =========================
                // 🔹 UC4: LinkedList Operations
                // =========================
                System.out.println("\n---- UC4: LinkedList Train Consist ----");

                LinkedList<String> train = new LinkedList<>();

                train.add("Engine");
                train.add("Sleeper");
                train.add("AC");
                train.add("Cargo");
                train.add("Guard");

                System.out.println("Initial train consist: " + train);

                train.add(2, "Pantry Car");
                System.out.println("After adding Pantry Car: " + train);

                train.removeFirst();
                train.removeLast();

                System.out.println("Final train consist: " + train);


                // =========================
                // 🔹 Program End
                // =========================
                System.out.println("\nSystem ready for next operation...");
            }
        }