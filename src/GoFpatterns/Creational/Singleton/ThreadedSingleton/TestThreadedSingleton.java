package GoFpatterns.Creational.Singleton.ThreadedSingleton;

public class TestThreadedSingleton implements Runnable {
    Thread thread;

    public static void main(String args[]) {

        TestThreadedSingleton t = new TestThreadedSingleton();
    }

    public TestThreadedSingleton() {
        DatabaseThreaded database;

        database = DatabaseThreaded.getInstance("names");

        thread = new Thread(this, "second");
        thread.start();

        System.out.printf("This is the '%s' database \n",
                database.getName());
    }

    public void run() {
        DatabaseThreaded database;

        database = DatabaseThreaded.getInstance("employees");

        System.out.printf("This is the '%s' database \n",
                database.getName());
    }
}
