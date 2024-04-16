package Tests;

import Classes.Login;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    @Test
    public void EmailTest(){
        String Email;
        Email = "2010954@mail.wit";
        assertEquals("2010954@mail.wit", Email);
    }

    @Test
    public void EmailValidTest() {
        String Email;
        Email = "2010954@mail.wit";
        assertTrue(Email.contains("@"));
        assertNotNull(Email);
    }
    @Test
        public void EmailinValidTest() {
            String Email;
            Email = "2010954ATmail.wit";
            assertFalse(Email.contains("@"));
        }

    @Test
    public void PasswordTest(){
        String Password;
        Password = "abcd";
        assertEquals("abcd", Password);
    }
    @Test
    public void PasswordValidTest(){
        String Password;
        Password = "abcdefghured";
        assertTrue(Password.length() > 8);
    }

    @Test
    public void PasswordInvalidTest(){
        String Password;
        Password = "abcd";
        assertFalse(Password.length() > 8);
    }

    @Test
    public void validateTest(){
        var login = new Login();

        String email = "2010954@mail.wit";
        String password = "password123";

        assertTrue(login.validate(email, password));
    }

    @Test
    public void WrongPassword(){
        var login = new Login();

        String email = "2010954@wit.ie";
        String password = "222";

        assertFalse(login.validate(email, password));
    }
}

