package Lv2_calculator;

import java.util.ArrayList;

/**
 * - [ ]  사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
 *     - [ ]  사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현
 *     - [ ]  연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
 *     - [ ]  1) 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산(➕,➖,✖️,➗) 기능을 수행한 후 2) 결과 값을 반환하는 메서드와 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성합니다
 *     - [ ]  연산 수행 역할은 Calculator 클래스가 담당
 *     - [ ]  연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장
 * - [ ]  소스 코드 수정 후에도 수정 전의 기능들이 반드시 똑같이 동작해야합니다.
 * - [ ]  Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 수정
 *     - [ ]  키워드 : `컬렉션`
 *         - [ ]  컬렉션에서 ‘값을 넣고 제거하는 방법을 이해한다.’가 중요합니다!
 */

public class Calculator {

    //1. 속성
    private ArrayList<Double> resultsList = new ArrayList<>(); //컬렉션 Arry배열을 사용하여 저장공간 <> 제네릭?
    private double result; //계산값을 저장 하는공간
    private String getContinue;
    

    //2.생성자
    //없음.

    //3. 기능

    public int getFirstNumber(int firstNumber){
        //첫번째 숫자를 저장
        return firstNumber;
    }
    public int getSecondNumber(int secondNumber) {
        //두번째 숫자를 저장
        return secondNumber;
    }

    public String setGetCalculation(String getCalculation) {
        // 연산자를 저장
        return getCalculation;
    }
    //결과값 불러오기
    public double getResult(){
        return this.result;
    }
    //계산된 결과를 리스트에 저장하기
    public ArrayList<Double> getResultList(){
        return resultsList;
    }
    //저장된 리스트 배열 정수를 삭제하는 기능
    public void deleteResultList(int deleteResult){
        resultsList.remove(deleteResult);
    }


    //static 은 공유하는 공간이다.
    void addCalculate (int firstNumber, int secondNumber) {
          result = firstNumber + secondNumber; //첫번째 숫자와 두번째 숫자를 더하여 result 에 저장
          resultsList.add(result);  //result를 Arry 배열에 추가한다.
    }
    void substringCalculate (int firstNumber, int secondNumber){
        result = firstNumber - secondNumber; //첫번째 숫자와 두번째 숫자를 빼서 result 에 저장
        resultsList.add(result); //result를 Arry 배열에 추가한다.
    }
    void multiplierCalculator (int firstNumber, int secondNumber){
        result = firstNumber * secondNumber; //첫번째 숫자와 두번째 숫자를 곱하여 result 에 저장
        resultsList.add(result);//result를 Arry 배열에 추가한다.
    }
    void divisionCalculator (int firstNumber, int secondNumber){
        result = (double) firstNumber / secondNumber; //첫번째 숫자와 두번째 숫자를 나누기해서 result 에 저장
        resultsList.add(result);//result를 Arry 배열에 추가한다.
    }
    String setGetContinue (String getContinue){
        //계산기를 더 진행할지에 대한 값을 저장
        return getContinue;
    }



    
    


}