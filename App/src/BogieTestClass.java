import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }
}

public class BogieTestClass {

    public static void main(String[] args) {

        List<Bogie> bogies = Arrays.asList(
                new Bogie("B1", 50),
                new Bogie("B2", 70),
                new Bogie("B3", 80),
                new Bogie("B4", 90)
        );

        testCapacityGreaterThanThreshold(bogies);
        testNoBogiesMatching(bogies);
        testAllBogiesMatching(bogies);
        testEmptyList();
        testOriginalListUnchanged(bogies);
    }

    // Test: capacity > 70
    static void testCapacityGreaterThanThreshold(List<Bogie> bogies) {
        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 70)
                .collect(Collectors.toList());

        if (result.size() == 2) {
            System.out.println("PASS: Capacity > Threshold");
        } else {
            System.out.println("FAIL: Capacity > Threshold");
        }
    }

    // Test: No bogies match
    static void testNoBogiesMatching(List<Bogie> bogies) {
        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 100)
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("PASS: No Bogies Matching");
        } else {
            System.out.println("FAIL: No Bogies Matching");
        }
    }

    //  Test: All bogies match
    static void testAllBogiesMatching(List<Bogie> bogies) {
        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 40)
                .collect(Collectors.toList());

        if (result.size() == bogies.size()) {
            System.out.println("PASS: All Bogies Matching");
        } else {
            System.out.println("FAIL: All Bogies Matching");
        }
    }

    //  Test: Empty list
    static void testEmptyList() {
        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("PASS: Empty List");
        } else {
            System.out.println("FAIL: Empty List");
        }
    }

    //  Test: Original list unchanged
    static void testOriginalListUnchanged(List<Bogie> bogies) {
        int originalSize = bogies.size();

        List<Bogie> result = bogies.stream()
                .filter(b -> b.getCapacity() > 70)
                .collect(Collectors.toList());

        if (bogies.size() == originalSize && bogies != result) {
            System.out.println("PASS: Original List Unchanged");
        } else {
            System.out.println("FAIL: Original List Modified");
        }
    }
}