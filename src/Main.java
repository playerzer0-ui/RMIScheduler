import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //start a scheduler
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        //get a method there
        executor.scheduleAtFixedRate(Main::yap, 0, 1000, TimeUnit.MILLISECONDS);
        //all methods start at a certain period (it will display the scheduler at the most top first)
        executor.scheduleAtFixedRate(Main::yap2, 0, 1000, TimeUnit.MILLISECONDS);
        //you can also manually create a function inside the method
        executor.scheduleAtFixedRate(()->{
            System.out.println("guess the manual works");
        }, 0, 2000, TimeUnit.MILLISECONDS);
    }

    public static void yap(){
        System.out.println("I'mma yap");
    }

    public static void yap2(){
        System.out.println("I'mma yap2");
    }
}