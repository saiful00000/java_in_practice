package effective_java.concurrency;

public class Thread2 implements Runnable{
    MathUtils mathUtils;

    public Thread2(MathUtils mathUtils){
        this.mathUtils = mathUtils;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread 2 is running");
            mathUtils.getMultiples(3);
        }catch (Exception e){
            System.out.println("Exception raised " + e);
        }
    }
}
