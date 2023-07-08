package effective_java.singleton;

public class Singlton {
    private static Singlton singlton;

    private Singlton(){}

    public static Singlton getInstance() {
        if(singlton == null){
            synchronized (Singlton.class){
                if(singlton == null){
                    singlton = new Singlton();
                }
            }
        }
        return singlton;
    }

    public void showMessage() {
        System.out.println("This is an implementation of Singleton Class.");
    }
}
