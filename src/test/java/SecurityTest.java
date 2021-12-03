import com.example.assignment3.SecurityCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecurityTest {
    SecurityCheck security;

    @Test
    @DisplayName("Testing emails")
    void securityTest() {
        assertTrue(security.checkEmail("seanmarley40@gmail.com"));
        assertTrue(security.checkEmail("119454664@umail.ucc.ie"));
        assertFalse(security.checkEmail("1194@5466@4@umail.ucc.ie"));
        assertFalse(security.checkEmail("abcdefg"));



    }

}
