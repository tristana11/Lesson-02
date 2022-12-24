public class Lesson02task2 {
    public static void main(String[] args) {
        int w = (int)(Math.random() * 10 + 1);
        int h = (int)(Math.random() * 10 + 1);

        System.out.println("Прямоугольник с шириной "+w+" и высотой "+h);

        System.out.println("Периметр прямоугольника: " + (2 * (w + h)));
        System.out.println("Площадь прямоугольника: " + (w * h));
    }
}
