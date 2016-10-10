package pl.andrzej.bean;

/**
 * Created by Andrzej on 10.10.2016.
 */
public class PasswordResponse {

    private String status;
    private String message;

    public PasswordResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
