//제로베이스 미니과제6 김세훈

import java.util.Collections;
import java.util.Random;

public class Mini6 {

    public static void main(String[] args) {

        Random random = new Random();

        String candidate = new String(); //후보자 이름 저장 배열

        double votePer = 0; //투표율 함수

        int[] arrCandidate = new int[4];
        double[] arrCanPer = new double[4];
        //후보자 득표, 득표율 배열 -> 배열 크기가 딱맞을 경우 오류가 나서 하나 늘림

        for (int i = 0; i < 10000; i++) {
            int voteNum = random.nextInt(4) + 1; //랜덤함수 이용한 투표

            switch (voteNum) {
                case 1:
                    arrCandidate[0] += 1;
                    candidate = "이재명";
                    break;
                case 2:
                    arrCandidate[1] += 1;
                    candidate = "윤석열";
                    break;
                case 3:
                    arrCandidate[2] += 1;
                    candidate = "심상정";
                    break;
                case 4:
                    arrCandidate[3] += 1;
                    candidate = "안철수";
                    break;
            }
            // 스위치 함수를 이용하여 투표

            votePer = (double)(i + 1) / 100; //더블형 변환하여 투표율 계산

            for (int j = 0; j < 4; j++) {
                arrCanPer[j] = (double)arrCandidate[j] / 100;
            } //후보자별 득표율 for 함수 이용

            System.out.println("[투표진행률]: " + String.format("%2.2f", votePer) + "%, " + (i + 1) + "명 투표 => " + candidate);
            System.out.println("[기호:1] 이재명: " + String.format("%2.2f", arrCanPer[0]) + "%, (투표수: " + arrCandidate[0] + ")");
            System.out.println("[기호:2] 윤석열: " + String.format("%2.2f", arrCanPer[1]) + "%, (투표수: " + arrCandidate[1] + ")");
            System.out.println("[기호:3] 심상정: " + String.format("%2.2f", arrCanPer[2]) + "%, (투표수: " + arrCandidate[2] + ")");
            System.out.println("[기호:4] 안철수: " + String.format("%2.2f", arrCanPer[3]) + "%, (투표수: " + arrCandidate[3] + ")");

        }

        int presidentArr = arrCandidate[0];
        int president = 0; // 각각 최고 득표를 구하기 위해 변수 선언

        for (int i = 0; i < 4; i++) {
            if(presidentArr <= arrCandidate[i]) {
                presidentArr = arrCandidate[i];
                president = i;
            }
        }
        // 득표수 배열에서 for문을 이용하여 몇 번째 배열값이 가장 높은지 찾음

        int cnt = 0;
        for (int j = 0; j < 4; j++) {
            if (arrCandidate[j] == presidentArr) {
                cnt++;
            }
        }
        //최고 득표 동률을 찾기 위한 for 함수, cnt가 2 이상일 경우 아래 if else문을 이용하여 동률임을 알림

        if (cnt == 1) {
            switch (president + 1) {
                case 1:
                    System.out.println("[투표결과] 당선인: 이재명");
                    break;
                case 2:
                    System.out.println("[투표결과] 당선인: 윤석열");
                    break;
                case 3:
                    System.out.println("[투표결과] 당선인: 심상정");
                    break;
                case 4:
                    System.out.println("[투표결과] 당선인: 안철수");
                    break;
            }
        } else {
            System.out.println("당선자가 동률입니다.");
        }

    }

}
