import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //start a scheduler
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        //manually use this function here
        executor.scheduleAtFixedRate(()->{
            System.out.println("guess the manual works");
        }, 0, 2000, TimeUnit.MILLISECONDS);
    }
}