package cn.gx.exception;

/**
 * Created by guan_x on 2016/3/17.
 */
public class SpringException extends RuntimeException{

    private String exceptionMsg;
    public SpringException(String message) {
       this.exceptionMsg=message;
    }

    public String getExceptionMsg() {
        return exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
