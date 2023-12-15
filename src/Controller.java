import java.sql.SQLException;

public class Controller {
        UserFacade userFacade = UserFacade.getInstance();

        public boolean login(String mail, String password) throws SQLException {
            return userFacade.login(mail, password);
        }
        public String getName() {

            return userFacade.getCurrentCompanyName();
        }
}
