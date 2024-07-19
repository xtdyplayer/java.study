package hongfei.ArrayListTest;

public class User {
    private String UserName;
    private String Password;
    private String Id;

    public User() {
    }

    public User(String Id,String userName, String password) {
        this.Id=Id;
        UserName = userName;
        Password = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
