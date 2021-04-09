package accounts;

public class UserProfile {
    private final String login;
    private final String pass;
    private final String email;

    public UserProfile(final String login, final String pass, final String email) {
        this.login = login;
        this.pass = pass;
        this.email = email;
    }

    public UserProfile(final String login) {
        this(login, login, login);
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }
}
