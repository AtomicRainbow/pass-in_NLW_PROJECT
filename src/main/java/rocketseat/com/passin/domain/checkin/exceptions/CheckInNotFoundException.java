package rocketseat.com.passin.domain.checkin.exceptions;

public class CheckInNotFoundException extends RuntimeException {
    public CheckInNotFoundException(String message) {
        super(message);
    }
}
