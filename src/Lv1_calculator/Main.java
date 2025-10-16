package Lv1_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //스캐너 기능을 추가
        Scanner scanner = new Scanner(System.in);

        while(true) {  //반복문을 사용하여 계속 계산
            // 첫번째 계산할 숫자 저장하기
            System.out.println("첫번째로 입력할 숫자를 넣으세요: ");
            int num1 = scanner.nextInt();
            // 두번째 계산할 숫자 저장하기
            System.out.println("두번째로 입력할 숫자를 넣으세요: ");
            int num2 = scanner.nextInt();
            //사칙연산 기호 입력하고 저장하기
            System.out.println("계산할 사칙연산 기호를 입력하세요(ex:+, -, *, /): ");
            char calculation = scanner.next().charAt(0); // char calculation = scanner.nextchar() 은 안되는것인가??
            // if (calculation == '+' || calculation == '-' || calculation == '*' || calculation == '/') {
                switch (calculation) {
                    case ('+'):
                        System.out.println("계산 결과는: "+ (num1 + num2));
                        break;
                    case ('-'):
                        System.out.println("계산 결과는: "+ ((double) num1 - num2));
                        break;
                    case ('*'):
                        System.out.println("계산 결과는: "+ (num1 * num2));
                        break;
                    case ('/'):
                        if(num2 != 0) {
                            System.out.println("계산 결과는: "+ ((double) num1 / num2));
                        break;
                        }
                        else {
                            System.out.println("0은 입력할 수 없습니다.");
                        }
                    default: System.out.println("잘못된 입력값 입니다.");
                }
           // 계속해서 계산을 진행 할것인지에 대한 스캐너 입력
            scanner.nextLine();
            System.out.println("더 계산하시려면 1 ,종료하려면 exit 를 입력하세요");
            String ran = scanner.nextLine();
            // 계속해서 계산을 진행 할것인지에 대한 if 문 사용
            if (ran.equals("1")) {
                continue;
            } else if (ran.equals("exit")) {
                System.out.println("종료합니다.");
                System.exit(0);
            }


        }
    }
}

