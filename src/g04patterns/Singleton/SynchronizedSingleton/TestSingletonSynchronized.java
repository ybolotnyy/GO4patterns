package g04patterns.Singleton.SynchronizedSingleton;


public class TestSingletonSynchronized implements Runnable {
    Thread thread;

    public static void main (String args[]) {
        TestSingletonSynchronized t = new TestSingletonSynchronized();
    }

    public TestSingletonSynchronized() {
        DatabaseSynchronized database;

        database = DatabaseSynchronized.getInstance("products");

        thread = new Thread(this, "second");
        thread.start();

        System.out.println("This is the " + database.getName() + " database");
    }

    public void run() {
        DatabaseSynchronized database = DatabaseSynchronized.getInstance("employee");
        System.out.println("This is the " + database.getName() + " database");
    }

}
