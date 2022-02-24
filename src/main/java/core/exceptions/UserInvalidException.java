package core.exceptions;

public class UserInvalidException extends UserNotFoundException {
    public  UserInvalidException(String message) {
        super(message);
    }
}
