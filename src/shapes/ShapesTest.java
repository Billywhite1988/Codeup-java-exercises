package shapes;

    public class ShapesTest {


        public static void main(String[] args) {

            Rectangle Box1;

            Box1 = new Rectangle(5, 4);
            System.out.println("My rectangle's area is " + Box1.getArea());
            System.out.println("My rectangle's perimeter is " + Box1.getPerimeter());

            Square Box2;

            Box2 = new Square(5);
            System.out.println("The square's area is " + Box2.getArea());
            System.out.println("The square's perimeter is " + Box2.getPerimeter());
        }
    }

