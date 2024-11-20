package threadQuestion2;

public class myMain {

    public static myMain lock;

    public static void main(String[] args) {
        lock = new myMain();

        Thread1 t1 = new Thread1(lock);
        Thread2 t2 = new Thread2(lock);
        Thread3 t3 = new Thread3(lock);
        Thread4 t4 = new Thread4(lock);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    ///// Thread 1 ////
    static class Thread1 extends Thread {
        myMain lock;

        public Thread1(myMain lock) {
            this.lock = lock;
        }

        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("THREAD 1 : " + i);

                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    ///// Thread 2 ////
    static class Thread2 extends Thread {
        myMain lock;

        public Thread2(myMain lock) {
            this.lock = lock;
        }

        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("THREAD 2 : " + i);

                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    ///// Thread 3 ////
    static class Thread3 extends Thread {
        myMain lock;

        public Thread3(myMain lock) {
            this.lock = lock;
        }

        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("THREAD 3 : " + i);

                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    ///// Thread 4 ////
    static class Thread4 extends Thread {
        myMain lock;

        public Thread4(myMain lock) {
            this.lock = lock;
        }

        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("THREAD 4 : " + i);

                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
