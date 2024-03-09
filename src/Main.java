import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> grades = new ArrayList<>();
        System.out.print("Enter the size of the List: ");
        int n = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < n; i ++){
            System.out.print(i + 1 + ": ");
            grades.add(Integer.valueOf(scanner.nextLine()));
        }

        System.out.println(rounded(grades));

    }

    public static List<Integer> rounded(List<Integer> grades){
        List<Integer> round = new ArrayList<>();
        for(int grade:grades){
            if(grade >= 38){
                int diff = 5 - grade % 5;
                if (diff < 3){
                    grade += diff;
                }
            }
            round.add(grade);
        }
        return round;
    }
}
