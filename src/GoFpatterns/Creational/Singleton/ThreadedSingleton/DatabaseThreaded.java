package GoFpatterns.Creational.Singleton.ThreadedSingleton;

public class DatabaseThreaded {
    private static DatabaseThreaded singleObject =
            new DatabaseThreaded("products");
    private int record;
    private String name;

    private DatabaseThreaded(String n) {
        name = n;
        record = 0;
    }

    public static synchronized DatabaseThreaded getInstance(String name) {
        return singleObject;
    }

    public void editRecord(String operation) {
        System.out.printf("Performing a '%s' operation on record '%s' in database '%s' \n",
                operation,
                record,
                name);
    }

    public String getName() {
        return name;
    }
}

