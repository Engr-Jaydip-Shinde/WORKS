class CarAssembly extends Thread {
    private String task;
    private static final Object lock = new Object(); // Common lock for synchronization

    CarAssembly(String task) { 
        this.task = task; 
    }

    public void run() {
        synchronized (lock) {  // Synchronizing the block
            System.out.println(task + " started...");
            System.out.println(task + " completed!");
        }
    }
}

public class CarFactory {
    public static void main(String[] args) {
        CarAssembly t1 = new CarAssembly("Engine Installation");
        CarAssembly t2 = new CarAssembly("Painting");
        CarAssembly t3 = new CarAssembly("Tires Fixing");

        t1.start();
        t2.start();
        t3.start();
    }
}
