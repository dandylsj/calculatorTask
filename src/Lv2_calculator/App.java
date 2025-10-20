package Lv2_calculator;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.

import java.util.Scanner;

import static Lv2_calculator.Calculator.firstNumber;
import static Lv2_calculator.Calculator.secondNumber;

/**
 *- [ ]  **App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정 (캡슐화)**
 *     - [ ]  간접 접근을 통해 필드에 접근하여 **가져올** 수 있도록 구현합니다. (Getter 메서드)
 *     - [ ]  간접 접근을 통해 필드에 접근하여 **수정할** 수 있도록 구현합니다. (Setter 메서드)
 *     - [ ]  위 요구사항을 모두 구현 했다면 App 클래스의 main 메서드에서 위에서 구현한 메서드를 활용 해봅니다.
 *
 */
public class App {
    public static void main(String[] args) {

        while (true) {  //반복문을 사용하여 계속 계산
            // 첫번째 계산할 숫자 저장하기
            System.out.println("첫번째로 입력할 숫자를 넣으세요: ");
            Scanner number1 = new Scanner(System.in); //문자열 number1 에 스캐너 값을 넣는다.
            firstNumber = number1.nextInt(); // 문자열 number1 에 넣은 값을 정수형 firstNumber 변수에 넣는다.
            // 두번째 계산할 숫자 저장하기
            System.out.println("두번째로 입력할 숫자를 넣으세요: ");
            Scanner number2 = new Scanner(System.in);//문자열 number2 에 스캐너 값을 넣는다.
            secondNumber = number2.nextInt();//문자열 number2 에 넣은 값을 정수형 secondNumber 변수에 넣는다.
            //사칙연산 기호 입력하고 저장하기
            System.out.println("계산할 사칙연산 기호를 입력하세요(ex:+, -, *, /): ");
            Scanner calculation = new Scanner(System.in); //사칙연산 기호 스캐너 값을 calculation 변수에 넣는다.
            Calculator.getCalculation = calculation.next(); //calculation 변수의 값을 getCalculation 에 넣는다.
            switch (Calculator.getCalculation) {
                case ("+"):
                    //Calculator 클래스의 addCalculate 메서드를 불러오고 저장한 첫번째 변수와 두번째 변수를 가져온다.
                    Calculator.result = Calculator.addCalculate(firstNumber, secondNumber);
                    break;

                case ("-"):
                    //Calculator 클래스의 substringCalculate 메서드를 불러오고 저장한 첫번째 변수와 두번째 변수를 가져온다.
                    Calculator.result = (int) Calculator.substringCalculate(firstNumber, secondNumber);
                    break;
                case ("*"):
                    //Calculator 클래스의 multiplierCalculate 메서드를 불러오고 저장한 첫번째 변수와 두번째 변수를 가져온다.
                    Calculator.result = Calculator.multiplierCalculator(firstNumber, secondNumber);
                    break;
                case ("/"):
                    //두번째 정수의 값이 0 이면 입력할 수 없다는 경고가 뜬다.
                    if (secondNumber == 0) {
                        System.out.println("0은 입력할 수 없습니다.");
                        break;
                    } else {
                        //Calculator 클래스의 divisionCalculate 메서드를 불러오고 저장한 첫번째 변수와 두번째 변수를 가져온다.
                        Calculator.result = (int) Calculator.divisionCalculator(firstNumber, secondNumber);
                        break;
                    }
                default:
                    System.out.println("잘못된 입력값 입니다.");
            }
            System.out.println(Calculator.result); //결과값 출력 Calculator 클래스의 result 변수를 가져온다.

            System.out.println(Calculator.resultsList); //저장한 값들을 보여주기

//            System.out.println("더 계산하시려면 아무키나 ,종료하려면 exit 를 입력하세요");
//            Scanner continue1 = new Scanner(System.in);
//
//            if("exit".equals(Continue)) {
//                System.exit(0);
            }
        }
    }
