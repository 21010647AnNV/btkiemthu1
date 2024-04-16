public class HinhTron {
    public static void main(String[] args) {
        double radius = 5.0; // Bán kính của hình tròn
        double area = calculateCircleArea(radius);
        System.out.println("Diện tích của hình tròn có bán kính " + radius + " là: " + area);
    }

    public static double calculateCircleArea(double radius) {
        double pi = 3.14159; // Giá trị của số pi
        double area = pi * radius * radius;
        return area;
    }
}