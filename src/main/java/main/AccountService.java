package main;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by DaH4uk on 17.01.2016.
 */
public class AccountService {
    private Map<String, UserProfile> users = new HashMap<>();
    private Map<String, UserProfile> sessions = new HashMap<>();

    public boolean addUser(String userName, UserProfile userProfile){
        if (users.containsKey(userName)){
            return false;
        }
        else {
            users.put(userName,userProfile);
            return true;
        }
    }

    public void addSessions(String sessionsId, UserProfile userProfile){
        sessions.put(sessionsId,userProfile);
    }

    public main.UserProfile getUser(String userName) {
        return users.get(userName);
    }

    public UserProfile getSessions(String sessionId){
        return sessions.get(sessionId);
    }

}
