public class UserFacade {

    private static UserFacade instance;
    private User user;
    public static UserFacade getInstance() {
        if (instance == null) {
            instance = new UserFacade();
        }
        return instance;
    }

    public UserFacade() {}

    public User getCurrentUser(String mail, String password) throws SQLException {
        return user;
    }
    public boolean login(String mail, String password) throws SQLException {
        AbstractDAOFactory daoFactory = AbstractDAOFactory.getInstance();
        AbstractUserDAO userDAO = daoFactory.getUserDAO();
        user = userDAO.getUserByCredentials(mail, password);
        return user != null;
    }
    public String getCurrentCompanyName() {
        return user.getCompanyName();
    }
}
