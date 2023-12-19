import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PostGreSQLUserDAO extends AbstractUserDAO {
    private static PostGreSQLUserDAO instance;

    public static PostGreSQLUserDAO getInstance() {
        if (instance == null) {
            instance = new PostGreSQLUserDAO();
        }
        return instance;
    }
    @Override
    public User getUserByCredentials(String mail, String password) throws SQLException {
        //Get the connection
        Connection connection = PostGreSQLDAOFactory.getConnection();

        //Create the query
        String query = "SELECT * FROM users WHERE mail = ? AND password = ?";

        //Create the prepared statement
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        //Set the parameters
        preparedStatement.setString(1, mail);
        preparedStatement.setString(2, password);

        //Execute the query
        ResultSet resultSet = preparedStatement.executeQuery();

        // Check if the resultSet is empty
        if (!resultSet.next()) {
            return null; // User not found with given credentials
        } else {
            //Get username
            String companyName = resultSet.getString("companyName");

            //Get the data from the resultSet
            String role = resultSet.getString("role");

            // Create the user
            User user = new User(companyName, mail, password, role);

            System.out.println(user);
            // Return the user
            return user;
        }
        return instance;
    }
    @Override
    public User getUserByCredentials(String mail, String password) {
        return new User(mail, password, "name", "surname", "address", "phone", "role");
    }
}
