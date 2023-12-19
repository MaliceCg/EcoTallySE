public abstract class AbstractUserDAO {

    public abstract User getUserByCredentials(String mail, String password) throws SQLException;
}
