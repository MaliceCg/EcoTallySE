public class UserFacade {

    private static UserFacade instance;
    private User user;
    public static UserFacade getInstance() {
        if (instance == null) {
            instance = new UserFacade();
        }
        return instance;
    }

    public UserFacade() {


    }

    public User getCurrentUser() {
        return user;
    }
    public boolean login(String mail, String password) {
        AbstractDAOFactory daoFactory = AbstractDAOFactory.getInstance();
        AbstractUserDAO userDAO = daoFactory.getUserDAO();
        user = userDAO.getUserByCredentials(mail, password);
        return user != null;
    }
    public String getCurrentUserName() {

        return user.getName();
    }
}
