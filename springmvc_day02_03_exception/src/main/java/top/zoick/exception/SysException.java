package top.zoick.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zoick
 * @date 2019/7/25 14:18
 */
@Getter
@Setter

public class SysException extends Exception{

    //存储提示信息的
    private String message;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public SysException(String message) {
        this.message = message;
    }
}
