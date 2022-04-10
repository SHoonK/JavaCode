//제로베이스 미니과제1 김세훈

public class Mini1 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(String.format("%02d", j) + "x" + String.format("%02d", i) + "=" + String.format("%02d", i * j));
                //String format 함수를 이용하여 자릿수 설정
                System.out.print("    ");
            }
            System.out.println();
        }
    }
}
