import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeList grades = new GradeList();
        System.out.print("Enter the size of the List: ");
        int n = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ": ");
            int val = Integer.valueOf(scanner.nextLine());
            grades.add(val);
        }

        System.out.println(grades.roundgrades());

    }

    }

