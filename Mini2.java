//제로베이스 미니과제2 김세훈

import java.util.Scanner;

public class Mini2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액): ");
        int money = scanner.nextInt();

        int cashback = 0;

        // 최대 캐시백 300원 및 그 미만 값 계산, 이 때 int에 1000 나눔으로서 백원 단위로 출력되게 함
        if(money > 30000) {
            cashback = 300;
        } else {
            cashback = money / 1000;
            cashback *= 100;
        }

        System.out.println("결제 금액은 " + money + "원이고, 캐시백은 " + cashback + "원 입니다.");
    }

}
