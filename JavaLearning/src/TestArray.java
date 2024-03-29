
import java.util.Arrays;
import java.util.List;

public class TestArray {
    public static void main(String[] args) {
        // Creating an array
        String[] array = {"apple", "banana", "cherry", "date"};

        // Creating a List from the array using Arrays.asList()
        List<String> list = Arrays.asList(array);

        // Printing the list
        System.out.println("List created from array: " + list);

        // Modifying the list will also modify the original array
        list.set(1, "blueberry"); // Modifying the second element in the list
        System.out.println("Modified list: " + list);
        System.out.println("Original array after modification: " + Arrays.toString(array));

        // Attempting to add or remove elements from the list will throw an UnsupportedOperationException
        // list.add("grape"); // This line will throw UnsupportedOperationException
        // list.remove(0); // This line will throw UnsupportedOperationException

        // However, you can still modify the original array and it will reflect in the list
        array[0] = "apricot";
        System.out.println("Modified array: " + Arrays.toString(array));
        System.out.println("List after modifying the original array: " + list);

        // Note: Converting an array to a list using Arrays.asList() creates a fixed-size list.
        // Attempting to perform operations that change the size of the list (add, remove) will result in UnsupportedOperationException.
    }
}


