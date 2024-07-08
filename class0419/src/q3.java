public class q3 {
    public static void main(String[] args){
        int result_4 = 0;
        int result_7 = 0;
        for (int i = 1; i < 1000; i++){
            if ((i % 4 == 0)) {
                System.out.printf("%d + %d = %d\n", result_4, i, result_4 + i);
                result_4 = result_4 + i;
            }
            if ((i % 7 == 0)) {
                System.out.printf("%d + %d = %d\n", result_7, i, result_7 + i);
                result_7 = result_7 + i;
            }
        }
        System.out.printf("4의 배수 합 : %d, 7의 배수 합 : %d\n", result_4, result_7);
    }
}
