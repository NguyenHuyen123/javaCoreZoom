package dateTime;

import java.util.Date;
import java.util.Scanner;

public class App {
    // 1 year (365.24 days) =  31556926 seconds
    // 1 month (30.44 days) = 2629743 seconds
    // 1 week	 = 604800 seconds
    // 1 day	 = 86400 secondsw
    public static void main(String[] args) {
        Datetime d = new Datetime();
        System.out.println("TỔng thời gian timetamps: " + d.timesTamp() + d.time());
    }
}
