public class Lesson02task4 {
    public static void main(String[] args) {
        int n = 329;
        int s;
        int n1 = n % 10;
        int n10 = (n / 10) % 10;
        int n100 = (n / 100) % 10;
        s = n1 + n10 + n100;
        System.out.printf("Сумма цифр числа %d равна %d%n", n, s);
    }
}
