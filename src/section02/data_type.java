package section02;

public class data_type {
    public static void main(String[] args) {
        // 자료형은 자바 언어가 처리할 수 있는 데이터의 종류(type)를 의미.
        // 자료형은 기본 자료형과 참조 자료형으로 나뉨.

        // 1. 기본자료형:
        // (1) 정수형: byte, short, int, long
        // (2) 실수형: float, double
        // (3) 논리형: boolean
        // (4) 문자형: char

        // 2. 참조자료형: 배열형, 열거형, 클래스, 인터페이스

        //----------------------------------------

        // 기본자료형-정수형-byte, short, int, long

        // byte: 메모리 사용크기 1byte, 데이터 표현 범위 -128 ~ 127
        // short: 메모리 사용크기 2byte, 데이터 표현 범위 -32,768 ~ 32,767
        // int: 메모리 사용크기 4byte, 데이터 표현 범위 -2,147,483,648 ~ 2,147,483,647
        // long: 메모리 사용크기 8byte, 데이터 표현 범위 -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        //해당 자료형이 표현할 수 있는 범위를 벗어나면 전혀 다른 값이 저장 될 수 있습니다.

        // byte
        byte num1 = 100;
        // byte num2 = 128;
        System.out.println(num1); // 100
        // System.out.println(num2); => error

        // short
        short num2 = 100;
        // short num3 = 32768;
        System.out.println(num2); // 100
        // System.out.println(num3); => error

        // int
        // 자바에서는 정수의 연산 작업을 수행할 때 4byte를 기본 단위로 사용하기에, int보다 작은 크기의 정수 변수들은 모두 int형으로 변환되어 실행됨.
        int num3 = 1200;
        System.out.println(num3); // 1200

        // long
        // long형 주의사항: 저장하는 값의 마지막에 식별자인 'L'이나 'l'을 붙여 long형임을 컴파일러에게 알려줘야 함. 그렇지 않으면 컴파일러가 int형으로 인식하고 에러를 표시함.
        long num4 = 2147483648L;
        System.out.println(num4); //2147483648

        //-------------------------------------

        // 기본자료형-실수형-float, double
        // float: 메모리 사용크기 4byte, 정밀도 7자리
        // double: 메모리 사용크기 8byte, 정밀도 15자리

        // float
        // float형은 소수점 형식으로 소수점 7자리까지 표현하고, 무한대의 값을 저장할 수 있음. 식별자인 'F'나 'f'를 숫자 뒤에 붙여서 float형임을 알려줘야함.

        float halfMarathon = 21.0975f;
        System.out.println("하프 마라톤은 " + halfMarathon + "km를 달립니다."); //하프 마라톤은 21.0975km를 달립니다.

        // double
        // double은 소수점 15자리까지 표현할 수 있음. 데이터를 저장할때 뒤에'd'를 붙이는게 원칙이지만 일반적으로 'd'는 생략함.
        // 자바에서는 실수의 연산 작업을 수행할 때 double형을 기본으로 사용함. double보다 작은 크기의 float형 변수들은 모두 double 타입으로 변환되어 실행됨.

        double pieDouble = 3.141592653589793;
        float pieFloat = 3.141592653589793f;

        System.out.println("double : " + pieDouble); // double : 3.141592653589793
        System.out.println("float : " + pieFloat); // float : 3.1415927

        //-------------------------------------------------

        // 기본자료형-문자형-char
        char ga = '가';
        char na = '나';
        char alphabetA = 'a';
        char alphabetB = 'b';
        System.out.println(ga); // 가
        System.out.println(na); // 나
        System.out.println(alphabetA); // a
        System.out.println(alphabetB); // b

        //-----------------------------------------

        // 기본자료형-논리형-boolean
        boolean isStudent = true;
        System.out.println(isStudent); //true

        //--------------------------------------

        // 참조자료형-String
        String hi = "안녕하세요, ";
        String niceToMeetYou = "만나서 반갑습니다.";
        System.out.println(hi); // 안녕하세요,
        System.out.println(niceToMeetYou); // 만나서 반갑습니다.

    }
}
