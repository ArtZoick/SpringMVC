package top.zoick.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zoick
 * @date 2019/7/23 14:20
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

    private String username;
    private String password;
    private Integer age;
}
