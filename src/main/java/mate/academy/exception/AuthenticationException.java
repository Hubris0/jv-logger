package mate.academy.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AuthenticationException extends Exception {

    public AuthenticationException(String message) {
        super(message);
    }
}
