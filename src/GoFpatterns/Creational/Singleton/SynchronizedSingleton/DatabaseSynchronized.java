package GoFpatterns.Creational.Singleton.SynchronizedSingleton;

public class DatabaseSynchronized {
    private static DatabaseSynchronized singleObject;
    private int record;
    private String name;

    private DatabaseSynchronized(String n) {
        name = n;
        record = 0;
    }

    public static synchronized DatabaseSynchronized getInstance(String n) {
        if (singleObject == null) {
            singleObject = new DatabaseSynchronized(n);
        }

        return singleObject;
    }

    public void editRecord(String operation) {
        System.out.printf("Performing operation '%s' on record '%s' in database '%s'",
                operation,
                record,
                name);
    }

    public String getName() {
        return name;
    }
}
