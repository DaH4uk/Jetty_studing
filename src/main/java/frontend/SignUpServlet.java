package frontend;

import main.AccountService;
import main.UserProfile;
import templater.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DaH4uk on 17.01.2016.
 */
public class SignUpServlet extends HttpServlet {

    private AccountService accountService;

    public SignUpServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        Map<String, Object> pageVariables = new HashMap<>();

        if (accountService.addUser(name, new UserProfile(name, password, ""))){
            pageVariables.put("signUpStatus","New User created");
        } else {
            pageVariables.put("signUpStatus", "User with name " + name + " already exist");
        }

        resp.getWriter().println(PageGenerator.getPage("signupstatus.html", pageVariables));
        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
