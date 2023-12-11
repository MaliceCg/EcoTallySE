import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostGreSQLDAOFactory extends AbstractDAOFactory{

    @Override
    public AbstractUserDAO getUserDAO() {
        return PostGreSQLUserDAO.getInstance();
    }

    public static Connection getConnection() throws SQLException {
        String DB_URL = "jdbc:postgresql://localhost:5434/SE";
        String USER = "SE";
        String PASSWORD = "1234";

        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

}
