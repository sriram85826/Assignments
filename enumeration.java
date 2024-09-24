package Zoho1;

import java.util.Scanner;

public class enumeration {
    public enum Weekday {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1 for Sunday, 2 for Monday, etc.): ");
        int dayNumber = scanner.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            Weekday day = Weekday.values()[dayNumber - 1];
            System.out.println("The day is: " + day);
        } else {
            System.out.println("Invalid number. Please enter a number between 1 and 7.");
        }
        scanner.close();
    }
}

