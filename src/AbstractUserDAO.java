import java.sql.SQLException;

public abstract class AbstractUserDAO {
    private static AbstractUserDAO instance;
    public static AbstractUserDAO getInstancePostGres() {
        if (instance == null) {
            instance = new PostGreSQLUserDAO();
        }
        return instance;
    }
    public abstract User getUserByCredentials(String mail, String password) throws SQLException;
}
