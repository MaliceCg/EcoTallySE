public class PostGreSQLDAOFactory extends AbstractDAOFactory{

    @Override
    public AbstractUserDAO getUserDAO() {
        return PostGreSQLUserDAO.getInstance();
    }
}
