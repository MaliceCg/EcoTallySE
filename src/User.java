public class User {

    private String companyName;
    private String mail;
    private String password;
    private String role;

    public User(String companyName, String mail, String password, String role) {
        this.companyName = companyName;
        this.mail = mail;
        this.password = password;
        this.role = role;
    }

    public String getCompanyName() {

        return companyName;
    }
    public String getMail() {

        return mail;
    }

    public String getPassword() {

        return password;
    }

    public String getRole() {

        return role;
    }

}
