//제로베이스 미니과제3 김세훈

import java.util.Scanner;

public class Mini3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Scanner 함수를 이용하여 해당 값 입력
        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자): ");
        int age = scanner.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자입력): ");
        int hour = scanner.nextInt();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n): ");
        char merit = scanner.next().charAt(0); //char 함수를 이용하여 y/n 해당하는 경우 입력
        System.out.print("복지카드 여부를 입력해 주세요.(y/n): ");
        char card = scanner.next().charAt(0);

        int fee = 0; //입장료 값 초기화

        //각 조건의 경우의 수 if, else if, else를 이용하여 대입
        if(age < 3) {
            fee = 0;
        } else if (age >= 3 && age < 13 || hour > 17) {
            fee = 4000;
        } else if(merit == 'y' || card == 'y') {
            fee = 8000;
        } else {
            fee = 10000;
        }

        System.out.println("입장료: " + fee);

    }

}
