import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Magical BirthDAY Calculator!");
        System.out.println("What's your birthday?");
        String birthday = scanner.nextLine();
        LocalDate ld = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate bd = LocalDate.parse(birthday, formatter);
        Period diff = bd.until(ld);
        Period diff2 = ld.until(bd.withYear(LocalDate.now().getYear()));
        int yearDiff = ld.getYear()-bd.getYear();
        System.out.println(diff);
        System.out.println("That means you were born on a " + bd.getDayOfWeek() + "!");
        System.out.println("This year it falls on a " + bd.withYear(LocalDate.now().getYear()).getDayOfWeek() + "!");
        System.out.println("And since today is " + ld + ", there's only " + diff2 + " until the next one!");
        System.out.println("Bet yer excited to be turning " + yearDiff + "!");
    }
}
