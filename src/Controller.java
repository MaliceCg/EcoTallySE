public class Controller {
        UserFacade userFacade = UserFacade.getInstance();

        public boolean login(String mail, String password) {
            return userFacade.login(mail, password);
        }
        public String getName() {

            return userFacade.getCurrentCompanyName();
        }
}
