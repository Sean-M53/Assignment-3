import com.example.assignment3.SecurityCheck;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecurityTest {
    SecurityCheck security;

    @Test
    @DisplayName("Testing emails")
    void securityTest() {
        assertTrue(security.checkEmail("seanmarley40@gmail.com"));
    }

}
