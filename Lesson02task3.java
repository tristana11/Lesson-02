public class Lesson02task3 {
    public static void main(String[] args) {
        int r = (int) (Math.random() * 10 + 1);
        System.out.println("Подсчитать площадь круга и длину окружности с радиусом " + r);
        double areaOfCircle;
        double perimetrOfCircle;
        final double PI = 3.14;
        areaOfCircle = PI * (r * r);
        perimetrOfCircle = PI * (2 * r);

        System.out.println("Площадь круга: " + areaOfCircle);
        System.out.println("Периметр круга: " + perimetrOfCircle);
    }
}
