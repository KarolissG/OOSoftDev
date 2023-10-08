
import java.util.Calendar;

public class Clock {
    public static void main(String Args[]) {

        Calendar cal = Calendar.getInstance();
        Time t = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), 0);
        long i;
        int count = 0;
        while (count < 60) {
            i = System.currentTimeMillis(); // make current time passed // as variable
            while ((System.currentTimeMillis() - i) != 1000) {// wait untill time difference is 1000 miliseconds
            }
            t.tick();// add second
            System.out.println(t.toString());// print time
            count++;
        }
    }
}