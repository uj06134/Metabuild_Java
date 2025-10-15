public class Ex03_관계논리연산자 {

    public static void main(String[] args) {
        int a=3, b=20;
        boolean result = a >=b;
        System.out.println("result : " + result);
        System.out.println(30==30);
        System.out.println(30!=32);

        boolean result2 = 20>10 && 5<3; // T && F
                System.out.println("result2 : " +result2);

        boolean result3 = 20>10 || 5<3; // T || F
        System.out.println("result2 : " +result3);

        System.out.println(!(5>3)); // not연산자
        /*
        && : and 연산자
        T && T => T
        T && F => F
        F && T => F
        F && F => F

         : or 연산자
        T && T => T
        T && F => T
        F && T => F
        F && F => F
        */
    }

}