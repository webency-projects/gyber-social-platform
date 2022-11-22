package dao;

/*
 * Создать поля которые будут содержать ОСНОВНУЮ информацию 
 * о пользователе , остальную информацию будет содержать 
 * UserData. Спроси Gyber какие поля должны быть у пользователя 
 * основными и реализуй средствами Java . Тоже самое сделай и с UserData 
 * обьектом 
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
