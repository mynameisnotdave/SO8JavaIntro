public class CircleCalculator {
    public static void main(String[] args) {
        double pi = 3.14;
        double circleRadius = 12.0;
        double circleDiameter = circleRadius * 2;
        double circleCircumference = pi * (circleRadius * 2);
        double circleArea = pi * (circleRadius * circleRadius);
        System.out.println("Circle diameter = " + circleDiameter);
        System.out.println("Circle circumference = " + circleCircumference);
        System.out.println("Circle area = " + circleArea);
    }
}
