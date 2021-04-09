package accounts;

import java.util.HashMap;
import java.util.Map;

public class AccountService {
    private final Map<String, UserProfile> loginToProfile;
    private final Map<String, UserProfile> sessionIdToProfile;

    public AccountService() {
        this.loginToProfile = new HashMap<>();
        this.sessionIdToProfile = new HashMap<>();
    }

    public void addNewUser(final UserProfile userProfile) {
        loginToProfile.put(userProfile.getLogin(), userProfile);
    }

    public UserProfile getUserByLogin(final String login) {
        return loginToProfile.get(login);
    }

    public void addNewSessionId(final String sessionId, final UserProfile userProfile) {
        sessionIdToProfile.put(sessionId, userProfile);
    }

    public UserProfile getUserBySessionId(final String sessionId) {
        return sessionIdToProfile.get(sessionId);
    }

    public void deleteSession(final String sessionId) {
        sessionIdToProfile.remove(sessionId);
    }

    public boolean existUserByLogin(final String login) {
        return loginToProfile.containsKey(login);
    }
}
