package nr;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

    private int[] times = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
    private Timer[] timers = new Timer[15];
    private TimerTask[] tasks = new TimerTask[15];

    private String[] titles = {
            // competition
            "\u001B[38;5;153m" + "The Opponent challenges the Reporter for the problem",// 1min
            "\u001B[38;5;153m" + "The Reporter accepts or rejects the challenge",// 1min
            "\u001B[38;5;153m" + "Preparation of the Reporter",// 5mins
            "\u001B[38;5;153m" + "Presentation of the reporter",// 12mins
            "\u001B[38;5;153m" + "Questions of the Opponent to the Reporter and answers of the Reporter",// 2mins
            "\u001B[38;5;153m" + "Preparation of the Opponent",// 3mins
            "\u001B[38;5;153m" + "The Opponent takes the floor",// 4mins
            "\u001B[38;5;153m" + "Discussion between the Reporter and the Opponent",//10mins
            "\u001B[38;5;153m" + "The Opponent summarizes the discussion",//1mins
            "\u001B[38;5;153m" + "Questions of the Reviewer to the Reporter and the Opponent and answers to the questions",// 3mins
            "\u001B[38;5;153m" + "Preparation of the Reviewer",// 2mins
            "\u001B[38;5;153m" + "The Reviewer takes the floor",// 4mins
            "\u001B[38;5;153m" + "Concluding remarks of the Reporter",// 2min
            "\u001B[38;5;153m" + "Questions of the Jury"// 3mins
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
                if (count >= 60) {
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
        int minutes = i / 60;
        int seconds = i % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer1() {
        if (timers[0] != null) {
            timers[0].cancel();
            System.out.println(" ");
            System.out.println(titles[1]);
            run2();
        }
    }

    public void run2() {

        timers[1] = new Timer();
        tasks[1] = new TimerTask() {
            private int count2 = 0;

            public void run() {
                if (count2 >= 60) {
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
        int minutes = j / 60;
        int seconds = j % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
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
                if (count3 >= 300) {
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
        int minutes = k / 60;
        int seconds = k % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer3() {
        if (timers[2] != null) {
            timers[2].cancel();
            System.out.println(" ");
            System.out.println(titles[3]);
            run4();
        }
    }

    private void run4() {
        timers[3] = new Timer();
        tasks[3] = new TimerTask() {
            private int count4 = 0;

            public void run() {
                if (count4 >= 720) {
                    stopTimer4();
                    return;
                }
                doSomething4(times[3]++);
                count4++;
            }
        };
        timers[3].schedule(tasks[3], 0, 1000);
    }

    private void doSomething4(int l) {
        int minutes = l / 60;
        int seconds = l % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer4() {
        if (timers[3] != null) {
            timers[3].cancel();
            System.out.println(" ");
            System.out.println(titles[4]);
            run5();
        }
    }

    private void run5() {
        timers[4] = new Timer();
        tasks[4] = new TimerTask() {
            private int count5 = 0;

            public void run() {
                if (count5 >= 120) {
                    stopTimer5();
                    return;
                }
                doSomething5(times[4]++);
                count5++;
            }
        };
        timers[4].schedule(tasks[4], 0, 1000);
    }

    private void doSomething5(int m) {
        int minutes = m / 60;
        int seconds = m % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer5() {
        if (timers[4] != null) {
            timers[4].cancel();
            System.out.println(" ");
            System.out.println(titles[5]);
            run6();
        }
    }

    private void run6() {
        timers[5] = new Timer();
        tasks[5] = new TimerTask() {
            private int count6 = 0;

            public void run() {
                if (count6 >= 180) {
                    stopTimer6();
                    return;
                }
                doSomething6(times[5]++);
                count6++;
            }
        };
        timers[5].schedule(tasks[5], 0, 1000);
    }

    private void doSomething6(int n) {
        int minutes = n / 60;
        int seconds = n % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer6() {
        if (timers[5] != null) {
            timers[5].cancel();
            System.out.println(" ");
            System.out.println(titles[6]);
            run7();
        }
    }

    private void run7() {
        timers[6] = new Timer();
        tasks[6] = new TimerTask() {
            private int count7 = 0;

            public void run() {
                if (count7 >= 240) {
                    stopTimer7();
                    return;
                }
                doSomething7(times[6]++);
                count7++;
            }
        };
        timers[6].schedule(tasks[6], 0, 1000);
    }

    private void doSomething7(int o) {
        int minutes = o / 60;
        int seconds = o % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer7() {
        if (timers[6] != null) {
            timers[6].cancel();
            System.out.println(" ");
            System.out.println(titles[7]);
            run8();
        }
    }

    private void run8() {
        timers[7] = new Timer();
        tasks[7] = new TimerTask() {
            private int count8 = 0;

            public void run() {
                if (count8 >= 600) {
                    stopTimer8();
                    return;
                }
                doSomething8(times[7]++);
                count8++;
            }
        };
        timers[7].schedule(tasks[7], 0, 1000);
    }

    private void doSomething8(int p) {
        int minutes = p / 60;
        int seconds = p % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer8() {
        if (timers[7] != null) {
            timers[7].cancel();
            System.out.println(" ");
            System.out.println(titles[8]);
            run9();
        }
    }

    private void run9() {
        timers[8] = new Timer();
        tasks[8] = new TimerTask() {
            private int count9 = 0;

            public void run() {
                if (count9 >= 60) {
                    stopTimer9();
                    return;
                }
                doSomething9(times[9]++);
                count9++;
            }
        };
        timers[8].schedule(tasks[8], 0, 1000);
    }

    private void doSomething9(int q) {
        int minutes = q / 60;
        int seconds = q % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer9() {
        if (timers[8] != null) {
            timers[8].cancel();
            System.out.println(" ");
            System.out.println(titles[9]);
            run10();
        }
    }

    private void run10() {
        timers[9] = new Timer();
        tasks[9] = new TimerTask() {
            private int count10 = 0;

            public void run() {
                if (count10 >= 180) {
                    stopTimer10();
                    return;
                }
                doSomething10(times[9]++);
                count10++;
            }
        };
        timers[9].schedule(tasks[9], 0, 1000);
    }

    private void doSomething10(int r) {
        int minutes = r / 60;
        int seconds = r % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer10() {
        if (timers[9] != null) {
            timers[9].cancel();
            System.out.println(" ");
            System.out.println(titles[10]);
            run11();
        }
    }

    private void run11() {
        timers[10] = new Timer();
        tasks[10] = new TimerTask() {
            private int count11 = 0;

            public void run() {
                if (count11 >= 120) {
                    stopTimer11();
                    return;
                }
                doSomething11(times[10]++);
                count11++;
            }
        };
        timers[10].schedule(tasks[10], 0, 1000);
    }

    private void doSomething11(int s) {
        int minutes = s / 60;
        int seconds = s % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer11() {
        if (timers[10] != null) {
            timers[10].cancel();
            System.out.println(" ");
            System.out.println(titles[11]);
            run12();
        }
    }

    private void run12() {
        timers[11] = new Timer();
        tasks[11] = new TimerTask() {
            private int count12 = 0;

            public void run() {
                if (count12 >= 240) {
                    stopTimer12();
                    return;
                }
                doSomething12(times[11]++);
                count12++;
            }
        };
        timers[11].schedule(tasks[11], 0, 1000);
    }

    private void doSomething12(int s) {
        int minutes = s / 60;
        int seconds = s % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer12() {
        if (timers[11] != null) {
            timers[11].cancel();
            System.out.println(" ");
            System.out.println(titles[12]);
            run13();
        }
    }

    private void run13() {
        timers[12] = new Timer();
        tasks[12] = new TimerTask() {
            private int count13 = 0;

            public void run() {
                if (count13 >= 120) {
                    stopTimer13();
                    return;
                }
                doSomething13(times[12]++);
                count13++;
            }
        };
        timers[12].schedule(tasks[12], 0, 1000);
    }

    private void doSomething13(int t) {
        int minutes = t / 60;
        int seconds = t % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer13() {
        if (timers[12] != null) {
            timers[12].cancel();
            System.out.println(" ");
            System.out.println(titles[13]);
            run14();
        }
    }

    private void run14() {
        timers[13] = new Timer();
        tasks[13] = new TimerTask() {
            private int count14 = 0;

            public void run() {
                if (count14 >= 180) {
                    stopTimer14();
                    return;
                }
                doSomething14(times[13]++);
                count14++;
            }
        };
        timers[13].schedule(tasks[13], 0, 1000);
    }

    private void doSomething14(int u) {
        int minutes = u / 60;
        int seconds = u % 60;

        if (seconds == 59) {
            minutes++;
            seconds = 1;
        }
        System.out.println("\u001B[38;5;231m" + minutes + "min " + seconds + "s");
    }

    private void stopTimer14() {
        if (timers[13] != null) {
            timers[13].cancel();
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("Take a rest for preparing next stage");
        }
    }
}