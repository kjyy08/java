public class q6 {
    public static void main(String[] args) {
        String text ="Four score and seven years ago our fathers brought forth on this continent," +
                " a new nation, conceived in Liberty, and dedicated to the proposition that all men are created equal.";

        String[] newTextList = text.split(" ");

        System.out.println("1. a를 S로 변환\n=> " + text.replace('a', 'S'));
        System.out.println("2. suwon을 붙여서 변환\n=> " + text.replace(",", ",Suwon "));
        System.out.println("3. , .을 제거\n=> " + text.replace(",", "").replace(".", ""));

        System.out.println("4. 단어장 리스트");
        for (String tmp : newTextList){
            System.out.println(tmp);
        }
        System.out.println("5. 각 단어에서 5 이상의 길이인 단어");
        for (String tmp : newTextList){
            if (tmp.length() >= 5){
                System.out.println(tmp);
            }
        }
    }
}
