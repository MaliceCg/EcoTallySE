public class User {

    private String username;
    private String mail;
    private String password;
    private String role;

    public User(String username, String mail, String password, String role) {
        this.username = username;
        this.mail = mail;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
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
