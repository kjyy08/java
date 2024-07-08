import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        boolean flag = true;
        int num;
        Scanner sc = new Scanner(System.in);

        while(flag) {
            System.out.print("구구단 입력: ");
            num = sc.nextInt();

            if (num == -1){
                flag = false;
            }
            else if (num >= 2 && num <= 9){
                for (int i = 1; i <= 9; i++){
                    System.out.printf("%d * %d = %d\n", num, i, num * i);
                }
            }
            else {
                continue;
            }
        }
    }
}
