import java.util.ArrayList;
import java.util.Arrays;

public class NameSwitcher {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jinnie", "Bella", "Edward", "Jacob", "Alice"));
        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) {
            String switchedName = switchFirstAndLast(name);
            switchedNames.add(switchedName);
        }

        System.out.println("Names = { " + String.join(", ", names) + " }");
        System.out.println("Names (switched) = { " + String.join(", ", switchedNames) + " }");
    }

    private static String switchFirstAndLast(String name) {
        if (name.length() <= 1) {
            return name;
        }
        // Convert the first character of the name to uppercase after switching
        // and ensure the rest of the name is in lowercase
        String start = name.substring(name.length() - 1).toUpperCase();
        String middle = name.substring(1, name.length() - 1).toLowerCase();
        String end = name.substring(0, 1).toLowerCase();
        return start + middle + end;
    }
}
