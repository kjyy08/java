public class q5 {
    public static void main(String[] args){
        String originalList = "이유덕,이재철,권종표,이재철,박민호,강상희,권종표,이재철," +
                "김지완,최승혁,권종표,이성연,박영서,박민호,전경헌,권종표,송정환,김재성,이유덕,전경헌";
        String[] nameList = originalList.split(",");
        int cntKnL = 0, cntK = 0;

        int i = 0;
        for (String name : nameList){
            if (name.startsWith("김") || name.startsWith("이")){
                cntKnL++;
            }
            if (name.equals("권종표")){
                cntK++;
            }
            System.out.println("name[" + i + "] : " + name);
            i++;
        }



        System.out.println("김과 이씨 수 : " + cntKnL);
        System.out.println("권종표 수 : " + cntK);
    }
}
