public class CircleComputation {
    public static void main(String[] args){
        double radius, arena, circumferece;

        final double PI = 3.14159265;

        radius = 1.2;

        arena = radius * radius * PI;

        circumferece = 2.0 * radius * PI;

        System.out.print("The radius is ");
        System.out.println(radius);
        System.out.print("The area is ");
        System.out.println(arena);
        System.out.print("The circumference is ");
        System.out.println(circumferece);

    }
}
