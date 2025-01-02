// HelloWorld.java
public class HelloWorld {

    public static void main(String[] args) {
        // Print a simple message
        System.out.println("Hello, World!");

        // Example of a switch expression introduced in Java 17
        String day = "MONDAY";

        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        // Print the result
        System.out.println(day + " is a " + typeOfDay + ".");
    }
}
