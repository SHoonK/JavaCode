//제로베이스 미니과제4 김세훈

import java.util.Random;
import java.util.Scanner;

public class Mini4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Scanner 함수로 해당하는 값 입력
        System.out.println("[주민등록번호 계산]");
        System.out.print("출생년도를 입력해 주세요.(yyyy): ");
        int year = scanner.nextInt();
        System.out.print("출생월을 입력해 주세요.(mm): ");
        int month = scanner.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd): ");
        int day = scanner.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f): ");
        char sex = scanner.next().charAt(0);

        int frontNum = (year - 2000) * 10000 + month * 100 + day; //주민번호 앞자리 계산
        int backNum = random.nextInt(1000000);
        int backNum1 = 0; //성별

        // 성별이 남성일 경우 앞에3, 여성일 경우 앞에4 붙여줌
        if (sex == 'm') {
            backNum1 = 3000000;
        } else if (sex == 'f') {
            backNum1 = 4000000;
        }

        backNum += backNum1; //뒷자리 7자리 전체 값

        System.out.println(frontNum + "-" + backNum);

    }
}
