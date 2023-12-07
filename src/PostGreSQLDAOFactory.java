public class PostGreSQLDAOFactory extends AbstractDAOFactory{
    private AbstractUserDAO userDAO;

    @Override
    public AbstractUserDAO getUserDAOPostGres() {
        return AbstractUserDAO.getInstancePostGres();
    }
}
