import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.*;
public class TrainConsistManagement {
    public static void main(String [] args){



                LinkedHashSet<String> train = new LinkedHashSet<>();

                train.add("Engine");
                train.add("Sleeper");
                train.add("Cargo");
                train.add("Guard");

                train.add("Sleeper"); // duplicate

                System.out.println(train);
            }
        }