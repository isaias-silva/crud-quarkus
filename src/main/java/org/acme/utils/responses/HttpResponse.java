package org.acme.utils.responses;

public class HttpResponse {
   private String message;
    public HttpResponse(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
