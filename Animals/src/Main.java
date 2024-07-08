import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static final String txtLine = "\n--------------------------------------------------------------\n";

    public static void main(String[] args) throws IOException {
        //  파일 생성
        File file = new File("animal.txt");

        //  예외처리
        try {
            //  없으면 생성
            if(!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //  객체 초기화
        FileOutputStream fileOutputStream = new FileOutputStream("animal.txt");
        Scanner sc = new Scanner(System.in);
        Cat cat = new Cat("냥냥이", 10, 50, 3.0f, new Vector2(0, 0));
        Dog dog = new Dog("댕댕이", 5, 80, 5.0f, new Vector2(100, 0));
        Bird bird = new Bird("쪼쪼", 5, 40, 25.0f, new Vector2(0, 100));
        Snake snake = new Snake("아나콘다", 5, 300, 15.0f, new Vector2(200, 200));
        Tiger tiger = new Tiger("호랭이", 100, 500, 30.0f, new Vector2(0, 0));
        Horse horse = new Horse("말랭이", 35, 25, 45.0f, new Vector2(0, 0));
        Mouse mouse = new Mouse("쥐쥐", 45, 1, 30.0f, new Vector2(15, 60));
        Cow cow = new Cow("말랑카우", 500, 5, 2.0f, new Vector2(30, 0));
        Pig pig = new Pig("살찐자", 200, 10, 1.0f, new Vector2(0, 0));
        Chicken chicken = new Chicken("후라이드치킨", 3, 25, 8.0f, new Vector2(0, 0));

        //  메인 루프 변수 초기화
        int selectMenu = 0;
        String animalName = "";
        String writeText = "";

        //  메인 루프
        while(selectMenu != -1){
            System.out.println("---메뉴 선택---\n1. 동물 검색\n2. 동물 이동\n3. 동물 리스트 전체 출력\n4.종료");
            selectMenu = sc.nextInt();

            switch (selectMenu) {
                //  동물이름으로 검색하여 상세 정보 출력
                case 1:
                    System.out.print("어떤 동물을 출력하겠습니까? ");
                    animalName = sc.next();

                    if (animalName.equals("냥냥이")) {
                        writeText = cat.show();
                    } else if (animalName.equals("댕댕이")) {
                        writeText = dog.show();
                    } else if (animalName.equals("쪼쪼")) {
                        writeText = bird.show();
                    } else if (animalName.equals("아나콘다")) {
                        writeText = snake.show();
                    } else if (animalName.equals("호랭이")) {
                        writeText = tiger.show();
                    } else if (animalName.equals("말랭이")) {
                        writeText = horse.show();
                    } else if (animalName.equals("쥐쥐")) {
                        writeText = mouse.show();
                    } else if (animalName.equals("말랑카우")) {
                        writeText = cow.show();
                    } else if (animalName.equals("살찐자")) {
                        writeText = pig.show();
                    } else if (animalName.equals("후라이드치킨")) {
                        writeText = chicken.show();
                    } else {
                        System.out.println("동물 리스트에 없는 이름입니다.");
                        break;
                    }

                    System.out.println(writeText);
                    fileOutputStream.write((writeText + txtLine).getBytes());
                    break;

                case 2:
                    //  동물 이동
                    System.out.print("어떤 동물을 이동시키겠습니까? ");
                    animalName = sc.next();
                    System.out.print("방향 입력(up, down, right, left):  ");
                    String direction = sc.next();

                    if (animalName.equals("냥냥이")) {
                        writeText = cat.move(direction);
                    } else if (animalName.equals("댕댕이")) {
                        writeText = dog.move(direction);
                    } else if (animalName.equals("쪼쪼")) {
                        writeText = bird.move(direction);
                    } else if (animalName.equals("아나콘다")) {
                        writeText = snake.move(direction);
                    } else if (animalName.equals("호랭이")) {
                        writeText = tiger.move(direction);
                    } else if (animalName.equals("말랭이")) {
                        writeText = horse.move(direction);
                    } else if (animalName.equals("쥐쥐")) {
                        writeText = mouse.move(direction);
                    } else if (animalName.equals("말랑카우")) {
                        writeText = cow.move(direction);
                    } else if (animalName.equals("살찐자")) {
                        writeText = pig.move(direction);
                    } else if (animalName.equals("후라이드치킨")) {
                        writeText = chicken.move(direction);
                    } else {
                        System.out.println("동물 리스트에 없는 이름입니다.");
                        break;
                    }

                    System.out.println(writeText);
                    fileOutputStream.write((writeText + txtLine).getBytes());
                    break;

                case 3:
                    //  터미널 출력
                    System.out.print(cat.show() + txtLine);
                    System.out.print(dog.show() + txtLine);
                    System.out.print(bird.show() + txtLine);
                    System.out.print(snake.show() + txtLine);
                    System.out.print(tiger.show() + txtLine);
                    System.out.print(horse.show() + txtLine);
                    System.out.print(mouse.show() + txtLine);
                    System.out.print(cow.show() + txtLine);
                    System.out.print(pig.show() + txtLine);
                    System.out.print(chicken.show());
                    //  파일 출력
                    fileOutputStream.write((cat.show() + txtLine).getBytes());
                    fileOutputStream.write((dog.show() + txtLine).getBytes());
                    fileOutputStream.write((bird.show() + txtLine).getBytes());
                    fileOutputStream.write((snake.show() + txtLine).getBytes());
                    fileOutputStream.write((tiger.show() + txtLine).getBytes());
                    fileOutputStream.write((horse.show() + txtLine).getBytes());
                    fileOutputStream.write((mouse.show() + txtLine).getBytes());
                    fileOutputStream.write((cow.show() + txtLine).getBytes());
                    fileOutputStream.write((pig.show() + txtLine).getBytes());
                    fileOutputStream.write((chicken.show() + txtLine).getBytes());
                    break;

                case 4:
                    //  프로그램 종료
                    System.out.print("프로그램을 종료합니다");
                    selectMenu = -1;
                    break;
            }

            System.out.println(txtLine);
        }

        fileOutputStream.close();
    }
}