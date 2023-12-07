public abstract class AbstractDAOFactory {
    private static AbstractDAOFactory instance;
    public static AbstractDAOFactory getDAOFactoryPostgres() {
        if (instance == null) {
            instance = new PostGreSQLDAOFactory();
        }
        return instance;
    }
    public abstract AbstractUserDAO getUserDAOPostGres();
}
