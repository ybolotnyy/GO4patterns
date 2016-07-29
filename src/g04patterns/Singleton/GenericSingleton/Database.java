package g04patterns.Singleton.GenericSingleton;

public class Database {
    private String name;
    private int record;
    private static Database singleInstance;

    private Database(String n) {
        name = n;
        record = 0;
    }

    public static Database createInstance(String name) {
        if (singleInstance == null) {
            singleInstance = new Database(name);
        }

        return singleInstance;
    }

    public void editRecord(String operation) {
        System.out.printf("Performing operation '$s' on the record '%d' \n",
                operation,
                record);
    }

    public String getName () {
        return name;
    }
}
