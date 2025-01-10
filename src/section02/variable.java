package section02;

public class variable {
    public static void main(String[] args) {
        // 변수를 선언하려면 메모리에 두 가지 정보가 필요함.
        // 첫 번째는 변수에 담을 데이터의 형태이고 두 번째는 변수의 이름이다.

        // 변수 선언하기
        String name;
        int age;
        char bloodType;

        // 변수 이름 정하기

        // 제약 조건:
        // 1. 영어 대소문자 구분
        // 2. 첫 글자는 숫자로 시작할 수 없으며, 일반적으로 영어 소문자로 시작.
        // 3. 특수문자는 '$', '_'만 사용 가능
        // 4. 자바 예약어는 사용 불가능

        // 변수에 데이터 입력하기
        int studentAge;
        studentAge = 20;

        System.out.println(studentAge); //20

        // 변수 선언 및 초기화 동시에 하기
        String myCity = "Seoul";
        System.out.println("I am from " + myCity); // I am from Seoul

        // 변수를 이용해 다른 변수에 복사하기
        int myAge = 20;
        int yourAge = myAge;
        System.out.println(myAge); // 20
        System.out.println(yourAge); // 20

        // 두개의 변수에 저장된 데이터 바꾸기
        int tempAge;
        yourAge = 30;

        tempAge = myAge;
        myAge = yourAge;
        yourAge = tempAge;
        System.out.println(myAge); //30
        System.out.println(yourAge); //20
    }
}
