package ca.tourism.platform.sdk.exceptions ;


public class HttpException extends Exception {

    private String msg ;
    private int statusCode ;
    private String exception ;
    private String messageDetails ;

    public HttpException(String message, int statusCode, String exception, String messageDetails) {
        super(String.format("Error mesage: Status code: %s. Message: %s. Exception class: %s. Details: %s", statusCode, message, exception, messageDetails));
        this.msg = message;
        this.statusCode = statusCode;
        this.exception = exception;
        this.messageDetails = messageDetails;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public String getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(String messageDetails) {
        this.messageDetails = messageDetails;
    }
}
