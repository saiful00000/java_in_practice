import effective_java.builder_pattern.Product;
import effective_java.concurrency.MathUtils;
import effective_java.concurrency.Thread1;
import effective_java.concurrency.Thread2;
import effective_java.enumeration.UserType;
import effective_java.factory_method.Shape;
import effective_java.factory_method.ShapeFactory;
import effective_java.factory_method.ShapeType;

public class Main {
    public static void main(String[] args) {
        /*
         * This the example of Builder pattern ( Creational design pattern )
         * */
        System.out.println("------------------Builder pattern-----------------");
        Product product = new Product.Builder()
                .setId(1)
                .setName("Mango")
                .setPrice(100)
                .setDescription("Lengra mango")
                .build();
        System.out.println(product.toString());
        System.out.println();

        /*
         * This is the Factory method example ( Creational design pattern )
         * */
        System.out.println("------------------Factory Method-----------------");
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape(ShapeType.CIRCLE);
        Shape triangle = shapeFactory.createShape(ShapeType.TRIANGLE);
        Shape square = shapeFactory.createShape(ShapeType.SQUARE);
        circle.print();
        triangle.print();
        square.print();
        System.out.println();

        /*
         * This example elaborate advance usage of enum
         * */
        System.out.println("------------------Advance Enumeration-----------------");
        System.out.println(UserType.SALES_REPRESENTATIVE.getDescription());
        System.out.println(UserType.SALES_SUPERVISOR.getDescription());
        System.out.println(UserType.SALES_MANAGER.getDescription());
        System.out.println();

        /*
         * This is the example for concurrency/multithreading
         * */
        System.out.println("-------------Concurrency/Multi threading---------------");
        MathUtils mathUtils = new MathUtils();
        Thread1 thread1 = new Thread1(mathUtils);
        Thread thread2 = new Thread((new Thread2(mathUtils)));

        thread1.start();
        thread2.start();

    }
}