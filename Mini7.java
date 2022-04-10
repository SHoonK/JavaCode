//제로베이스 미니과제7 김세훈

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Mini7 {

    public static void lottoSystem(int lottoNum) {
        int lotto2Arr[][] = new int[6][lottoNum];
        char[] lottoGroup = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};


        //내 로또 번호
        for (int i = 0; i < lottoNum; i++) {
            HashSet set1 = new HashSet();

            for (int j = 0; set1.size() < 6; j++) {
                int num = (int) (Math.random() * 45) + 1;
                set1.add(num);
            }

            LinkedList myLotto = new LinkedList<>(set1);
            Collections.sort(myLotto);
            System.out.println(lottoGroup[i] + "  " + myLotto); //여기까지 내 로또 결과 생성

            for (int j = 0; j < myLotto.size(); j++) {
                lotto2Arr[j][i] = (int) myLotto.get(j);
            }
        }
        System.out.println();


        //로또 번호 발표
        System.out.println("[로또 발표]");

        HashSet set = new HashSet();

        for (int j = 0; set.size() < 6; j++) {
            int num = (int) (Math.random() * 45) + 1;
            set.add(num);
        }

        LinkedList lottoResult = new LinkedList<>(set);
        Collections.sort(lottoResult);
        System.out.println("   " + lottoResult);
        System.out.println();


        //내 로또 결과 확인
        System.out.println("[내 로또 결과]");

        for (int i = 0; i < lottoNum; i++) {
            LinkedList myLottoRe = new LinkedList<>();
            int frequency = 0;

            System.out.print(lottoGroup[i]);

            for (int j = 0; j < 6; j++) {
                myLottoRe.add(lotto2Arr[j][i]);
                frequency += Collections.frequency(lottoResult, lotto2Arr[j][i]);
            }

            System.out.println("  " + myLottoRe + " => " + frequency + "개 일치");
        }

    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[로또 당첨 프로그램]");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10): ");
        int lottoNum = scanner.nextInt();

        lottoSystem(lottoNum);

    }
}
