package dao;


/*
 * По тому же принципу что и все классы в пакете dao 
 * спрашиваешь Gyber по каким критериям нужно авторизовывать 
 * пользователя и реализуешь средствами Java . 
 */
public class AuthDataUser {
    private String userName;
    private String lastName;
    private String email;
    private String password;

    public AuthDataUser(String userName, String lastName, String email, String password) {
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
