package Classes;

import java.util.HashMap;
import java.util.Map;

public class Login {

    static Map<String, String> emailToPassword = new HashMap<String, String>();

    public Login() {
        emailToPassword.put("2010954@mail.wit", "password123");
    }

    public boolean validate(String email, String password){
        return password.equals(emailToPassword.get(email));
    }
}
