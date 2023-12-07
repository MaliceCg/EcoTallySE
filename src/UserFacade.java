public class UserFacade {
    private final AbstractDAOFactory daoFactory;
    private final AbstractUserDAO userDAO;
    private static UserFacade instance;
    private User user;
    public static UserFacade getInstance() {
        if (instance == null) {
            instance = new UserFacade();
        }
        return instance;
    }

    public UserFacade() {
        daoFactory = AbstractDAOFactory.getDAOFactoryPostgres();
        userDAO = daoFactory.getUserDAOPostGres();
    }

    public User getCurrentUser(String mail, String password) {
        return userDAO.getUserByCredentials(mail, password);
    }
    public boolean login(String mail, String password) {
        User user = getCurrentUser(mail, password);
        return user != null;
    }
    public String getName() {
        return user.getName();
    }
}
