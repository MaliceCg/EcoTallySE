public class User {

    private String companyName;
    private String mail;
    private String password;
    private String name;
    private String surname;
    private String address;
    private String phone;
    private String role;

    public User(String companyName, String mail, String password, String role) {
        this.companyName = companyName;
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getRole() {

        return role;
    }
}
