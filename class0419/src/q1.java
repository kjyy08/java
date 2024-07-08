import java.util.*;

public class q1 {
    public static void main(String[] args){
        ArrayList<Integer> studentScoreList = new ArrayList<Integer>();
        int[] group = {0, 0, 0};

        for (int i = 0; i < 20; i++){
            studentScoreList.add(new Random().nextInt(0, 100));
            System.out.print("i(" + i + "): " + studentScoreList.get(i) + ", ");
        }
        System.out.println("\n----------------------------------");

        for (int i = 0; i < 20; i++){
            if (studentScoreList.get(i) >= 0 && studentScoreList.get(i) <= 30){
                group[0]++;
            }
            else if (studentScoreList.get(i) > 30 && studentScoreList.get(i) <= 60){
                group[1]++;
            }
            else {
                group[2]++;
            }
        }

        System.out.println("group 1: " + group[0]);
        System.out.println("group 2: " + group[1]);
        System.out.println("group 3: " + group[2]);
    }
}

