public class PostGreSQLUserDAO extends AbstractUserDAO{
    @Override
    public User getUserByCredentials(String mail, String password) {
        return new User(mail, password, "name", "surname", "address", "phone", "role");
    }
}
