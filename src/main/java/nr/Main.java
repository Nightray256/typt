package nr;

import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    private int[] times = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    private Timer[] timers = new Timer[3];
    private TimerTask[] tasks = new TimerTask[3];

    private String[] titles = {
            "\u001B[38;5;153m" + "The Opponent challenges the Reporter for the problem.",
            "\u001B[38;5;153m" + "The Reporter accepts or rejects the challenge.",
            "\u001B[38;5;153m" + "Preparation of the Reporter.",
            "\u001B[38;5;153m" + "Presentation of the reporter."
    };

    public static void main(String[] args) {
        Main timer = new Main();
        timer.run1();
    }

    public void run1() {
        timers[0] = new Timer();
        tasks[0] = new TimerTask() {
            private int count = 0;
            public void run() {
                if (count >= 5) {
                    stopTimer1();
                    return;
                }
                doSomething1(times[0]++);
                count++;
            }
        };
        timers[0].schedule(tasks[0], 0, 1000);
        System.out.println(titles[0]);
    }

    private void doSomething1(int i) {
        System.out.println("\u001B[38;5;231m" + i + "s");
    }

    private void stopTimer1() {
        if (timers[0] != null) {
            timers[0].cancel();
            System.out.println(" ");
            System.out.println(titles[1]);
            run2();
        }
    }

    public void run2(){
        timers[1] = new Timer();
        tasks[1] = new TimerTask() {
            private int count2 = 0;
            public void run() {
                if (count2 >= 5) {
                    stopTimer2();
                    return;
                }
                doSomething2(times[1]++);
                count2++;
            }
        };
        timers[1].schedule(tasks[1], 0, 1000);
    }

    private void doSomething2(int j) {
        System.out.println("\u001B[38;5;231m" + j + "s");
    }

    private void stopTimer2() {
        if (timers[1] != null) {
            timers[1].cancel();
            System.out.println(" ");
            System.out.println(titles[2]);
            run3();
        }
    }

    private void run3() {
        timers[2] = new Timer();
        tasks[2] = new TimerTask() {
            private int count3 = 0;
            public void run() {
                if (count3 >= 5) {
                    stopTimer3();
                    return;
                }
                doSomething3(times[2]++);
                count3++;
            }
        };
        timers[2].schedule(tasks[2], 0, 1000);
    }

    private void doSomething3(int k) {
        System.out.println("\u001B[38;5;231m" + k + "s");
    }

    private void stopTimer3() {
        if (timers[2] != null) {
            timers[2].cancel();
            System.out.println(" ");
            System.out.println(titles[3]);
        }
    }
}