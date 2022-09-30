package cn.zchenger.manager.exception;

public class ParameterException extends RuntimeException {
    private String message;
    private String code;
    public ParameterException(Throwable cause){
        super(cause);
    }
    public ParameterException(String message){
        super(message);
    }
    public ParameterException(String message,String code){
        super(message);
        this.code=code;
    }
}
