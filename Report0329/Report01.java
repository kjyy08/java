import java.util.Scanner;

public class Report01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, result = 0;

        System.out.print("숫자를 입력하세요: ");
        num = sc.nextInt();

        for(int i = 1; i < num; i++){
            if (result >= 1000){
                break;
            } else {
                System.out.printf("%d + %d = %d\n", result, i, result + i);
                result += i;
            }
        }

        System.out.println("결과는 " + result + "입니다.");
    }
}
