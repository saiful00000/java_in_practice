package effective_java.concurrency;

public class Thread1 extends Thread{
    MathUtils mathUtils;

    public Thread1(MathUtils mathUtils){
        this.mathUtils = mathUtils;
    }

    @Override
    public void run(){
        try {
            System.out.println("Thread 1 is running");
            mathUtils.getMultiples(2);
        }catch (Exception e){
            System.out.println("Exception raised " + e);
        }
    }
}
