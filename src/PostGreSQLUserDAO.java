public class PostGreSQLUserDAO extends AbstractUserDAO{
    private static PostGreSQLUserDAO instance;
    public static PostGreSQLUserDAO getInstance() {
        if (instance == null) {
            instance = new PostGreSQLUserDAO();
        }
        return instance;
    }
    @Override
    public User getUserByCredentials(String mail, String password) {
        return new User(mail, password, "name", "surname", "address", "phone", "role");
    }
}
