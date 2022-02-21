public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 5;
        int num3 = 40;
        int num4 = 50;

        System.out.println(num1 + num2);
        System.out.println(num3 + num4);
        System.out.println(num1 + num2 <= num3 + num4);

        int num5 = num1 + num2 + num3 + num4;
        int num6 = num5 + 1;
        System.out.println(num6);

        int num7 = num6 / 2;
        System.out.println(num7);
        System.out.println(num7 >= num6);
        System.out.println(num6 >= num6);
        System.out.println(num5 == 2);
        System.out.println(num6 <= num2);
        System.out.println(num5 == num7);
    }
}
