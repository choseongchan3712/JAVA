package section02;

public class print {
    public static void main(String[] args) {
        // 출력문
        // System.out.print(): 괄호안의 내용을 출력함. (문자열로 인)
        // System.out.println(): 괄호안의 내용을 출력하고 행을 바꿈. (문자열로 인식)
        // System.out.print(): 문자열을 서식 문자를 이용해 형식화된 내용으로 출력.

        // Print() 출력문
        System.out.print("Welcome.");
        System.out.print("JAVA World");
        System.out.println();
        System.out.println("------");
        // Welcome.JAVA World

        // Println() 출력문
        System.out.println("Welcome.");
        System.out.println("JAVA World!");
        System.out.println("------");
        //Welcome.
        //JAVA World!

        // Printf() 출력문은 값의 자료형에 따라 서식 문자를 이용해 출력하는 데이터 형식을 지정함.
        // 하나의 출력문에 여러 개의 서식 문자를 사용할 수 있으며 (,)으로 구분된 데이터가 순차적으로 대입되어 출력됨.
        // %d: 정수(10진수)
        // %o: 정수(8진수)
        // %x: 정수(16진수)
        // %f: 실수
        // %e: 지수(e표기 기반)
        // %g: 출력 대상에 따라 %e또는 %f형태로 출력
        // %s: 문자열
        // %c: 문자

        System.out.printf("저는 대학교 %d학년에 재학중입니다.", 3);
        //저는 대학교 3학년에 재학중입니다.

        System.out.printf("%d은 첫 번째, %f은 두 번째, %s은 세 번째", 1, 2.0, "셋");
        System.out.println();
        System.out.println("------");
        //1은 첫 번째, 2.000000은 두 번째, 셋은 세 번째

        //%nd: n칸 만큼 확보한 후, 오른쪽 정렬하여 출력
        System.out.printf("%5d", 1);
        System.out.println();
        System.out.printf("%5d", 12);
        System.out.println();
        System.out.printf("%5d", 123);
        System.out.println();
        System.out.printf("%5d", 1234);
        System.out.println();
        System.out.printf("%5d", 12345);
        System.out.println();
        //	   1
        //    12
        //   123
        //  1234
        // 12345

        //%.nf: 소수점 아래 n번째 자리까지 출력 (반올림)
        System.out.printf("%.1f", 1.1234567);
        System.out.println();
        System.out.printf("%.2f", 1.1234567);
        System.out.println();
        System.out.printf("%.3f", 1.1234567);
        System.out.println();
        System.out.printf("%.4f", 1.1234567);
        System.out.println();
        System.out.printf("%.5f", 1.1234567);
        System.out.println();
        //1.1
        //1.12
        //1.123
        //1.1235
        //1.12346

    }
}
