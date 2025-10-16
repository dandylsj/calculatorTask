package Lv1_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //스캐너 객체를 불러온다.
        Scanner scanner = new Scanner(System.in);

           // 첫번째 문자 입력 값 저장
            System.out.println("첫번째로 입력할 숫자를 넣으세요: ");
            int num1 = scanner.nextInt();
        // 두번째 숫자 입력 값 저장
            System.out.println("두번째로 입력할 숫자를 넣으세요: ");
            int num2 = scanner.nextInt();
            //사칙연산 기호를 저장
            System.out.println("계산할 사칙연산 기호를 입력하세요(ex:+, -, *, /): ");
            char calculation = scanner.next().charAt(0); // char calculation = scanner.nextchar() 은 안되는것인가??
        //if 문을 사용하여 사칙연산 입력값을 대조
            if (calculation == '+' || calculation == '-' || calculation == '*' || calculation == '/') {
                //switch 문을 사용하여 기호에 맞는 결과를 실행
                switch (calculation) {
                    case ('+'):
                        System.out.println("계산 결과는: " + (num1 + num2));
                        break;
                    case ('-'):
                        System.out.println("계산 결과는: " + ((double) num1 - num2));
                        break;
                    case ('*'):
                        System.out.println("계산 결과는: " + (num1 * num2));
                        break;
                    case ('/'):
                        if (num2 != 0) {
                            System.out.println("계산 결과는: " + ((double) num1 / num2));
                            break;
                        } else {
                            System.out.println("0은 입력할 수 없습니다.");
                        }
                    default:
                        System.out.println("잘못된 입력값 입니다.");
                }
            }
        }
    }


