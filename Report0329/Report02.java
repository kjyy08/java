import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Report02 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputDate;
        int year, month, day;

        System.out.print("날짜 입력(yyyymmdd): ");
        inputDate = sc.next();

        year = Integer.parseInt(inputDate.substring(0, 4));
        month = Integer.parseInt(inputDate.substring(4, 6));
        day = Integer.parseInt(inputDate.substring(6, 8));

        long result = ChronoUnit.DAYS.between(LocalDate.of(1900, 1, 1), LocalDate.of(year, month, day));
        System.out.println("입력받은 날은 1900년 1월 1일부터 " + result + "번째 날입니다.");
    }
}
