//제로베이스 미니과제8 김세훈

import java.util.Scanner;

public class Mini8 {
    public static void main(String args[]) {

        Mini8 mini8 = new Mini8();
        Scanner scanner = new Scanner(System.in);

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.: ");
        long income = scanner.nextLong(); //액수가 크기 때문에 long 함수 이용

        mini8.taxSystem(income); //세율에 의한 세금 계산
        mini8.progressiveDeduction(income); //누진공제에 의한 세금 계산


    }

    //세율에 의한 세금 계산
    private void taxSystem(long income) {

        long taxResult = 0; //전체 내야되는 세금
        long taxResultAl = 0; //수입이 해당 범위에 있을 경우 최고 세율로 남은 값 계산

        //while 무한루프 함수를 이용하여, 범위에 해당하는 if 구문에 들어가 계산 후 탈출
        while (true) {
            if (income <= 12000000) {
                taxResult = (long)(income * 0.06);
                System.out.println(income + " *  6% = " + taxResult);
                break;
            }
            System.out.println("12000000 *  6% = 720000");

            if (income > 12000000 && income <= 46000000) {
                taxResultAl = (long)((income - 12000000) * 0.15);
                taxResult = taxResultAl + 720000;
                System.out.println((income - 12000000) + " * 15% = " + taxResultAl);
                break;
            }
            System.out.println("34000000 * 15% = 5100000");

            if (income > 46000000 && income <= 88000000) {
                taxResultAl = (long)((income - 46000000) * 0.24);
                taxResult = taxResultAl + 5100000 + 720000;
                System.out.println((income - 46000000) + " * 24% = " + taxResultAl);
                break;
            }
            System.out.println("42000000 * 24% = 10080000");

            if (income > 88000000 && income <= 150000000) {
                taxResultAl = (long)((income - 88000000) * 0.35);
                taxResult = taxResultAl + 10080000 + 5100000 + 720000;
                System.out.println((income - 88000000) + " * 35% = " + taxResultAl);
                break;
            }
            System.out.println("62000000 * 35% = 21700000");

            if (income > 150000000 && income <= 300000000) {
                taxResultAl = (long)((income - 150000000) * 0.38);
                taxResult = taxResultAl + 21700000 + 10080000 + 5100000 + 720000;
                System.out.println((income - 150000000) + " * 38% = " + taxResultAl);
                break;
            }
            System.out.println("150000000 * 38% = 57000000");

            if (income > 300000000 && income <= 500000000) {
                taxResultAl = (long)((income - 300000000) * 0.40);
                taxResult = taxResultAl + 57000000 + 21700000 + 10080000 + 5100000 + 720000;
                System.out.println((income - 300000000) + " * 40% = " + taxResultAl);
                break;
            }
            System.out.println("200000000 * 40% = 80000000");

            if (income > 500000000 && income <= 1000000000) {
                taxResultAl = (long)((income - 500000000) * 0.42);
                taxResult = taxResultAl + 80000000 + 57000000 + 21700000 + 10080000 + 5100000 + 720000;
                System.out.println((income - 500000000) + " * 42% = " + taxResultAl);
                break;
            }
            System.out.println("500000000 * 42% = 210000000");

            if (income > 1000000000) {
                taxResultAl = (long)((income - 1000000000) * 0.45);
                taxResult = taxResultAl + 210000000 + 80000000 + 57000000 + 21700000 + 10080000 + 5100000 + 720000;
                System.out.println((income - 1000000000) + " * 45% = " + taxResultAl);
                break;
            }
            break;
        }
        System.out.println();
        System.out.println("[세율에 의한 세금]: " + taxResult);

    }

    //누진공제 계산에 의한 세금 계산
    private void progressiveDeduction(long income) {
        long proTaxResult = 0; //내야되는 전체 세금

        //if, else if 구문으로 간단하게 계산함
        if(income <= 12000000) {
            proTaxResult = (long)(income * 0.06);
        } else if (income > 12000000 && income <= 46000000) {
            proTaxResult = (long)((income * 0.15) - 1080000);
        } else if (income > 46000000 && income <= 88000000) {
            proTaxResult = (long)((income * 0.24) - 5220000);
        } else if (income > 88000000 && income <= 150000000) {
            proTaxResult = (long)((income * 0.35) - 14900000);
        } else if (income > 150000000 && income <= 300000000) {
            proTaxResult = (long)((income * 0.38) - 19400000);
        } else if (income > 300000000 && income <= 500000000) {
            proTaxResult = (long)((income * 0.40) - 25400000);
        } else if (income > 500000000 && income <= 1000000000) {
            proTaxResult = (long)((income * 0.42) - 35400000);
        } else if (income > 1000000000) {
            proTaxResult = (long)((income * 0.45) - 65400000);
        }
        System.out.println("[누진공제 계산에 의한 세금]: " + proTaxResult);

    }

}
