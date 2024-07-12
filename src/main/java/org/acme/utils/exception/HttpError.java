package org.acme.utils.exception;

public class HttpError extends Throwable{
    private int status;

public HttpError(int status, String message){
  super(message);
    this.status=status;

}

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
