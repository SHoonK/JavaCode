//제로베이스 미니과제5 김세훈

import java.util.Calendar;
import java.util.Scanner;

public class Mini5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy): ");
        int year = scanner.nextInt();
        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        int month = scanner.nextInt();

        int startDayOfWeek = 0;
        int endDay = 0;

        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();

        start.set(year, month - 1, 1); //입력받은 년도/달/1
        end.set(year, month, 1); //입력받은 년도/다음달/1
        end.add(Calendar.DATE,-1); //달의 마지막날 구함

        startDayOfWeek = start.get(Calendar.DAY_OF_WEEK); //시작일 요일 구함
        endDay = end.get(Calendar.DATE);

        System.out.println("[" + year + "년 " + String.format("%02d", month) + "월]");
        System.out.println();
        System.out.println("일   월    화   수   목    금   토");

        //월의 시작일에 따라 달력에 형식 맞춰줌
        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("     ");
        }

        int cnt = startDayOfWeek - 1; //줄넘김 계산을 위한 for 함수
        for (int i = 1; i < endDay; i++) {
            System.out.print(String.format("%02d", i) + "   ");
            cnt++;
            if (cnt == 7) {
                cnt = 0;
                System.out.println();
            }
        }

    }

}
