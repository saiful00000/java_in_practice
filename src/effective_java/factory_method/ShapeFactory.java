package effective_java.factory_method;

public class ShapeFactory {
    public Shape createShape(ShapeType type){
        switch (type) {
            case CIRCLE -> {
                return new Circle();
            }
            case TRIANGLE -> {
                return new Triangle();
            }
            case SQUARE -> {
                return new Square();
            }
        }
        return null;
    }
}
