public abstract class AbstractDAOFactory {
    private static AbstractDAOFactory instance;
    public static AbstractDAOFactory getInstance() {
        if (instance == null) {
            instance = new PostGreSQLDAOFactory();
        }
        return instance;
    }
    public abstract AbstractUserDAO getUserDAO();
}
