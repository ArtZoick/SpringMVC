package top.zoick.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zoick
 * @date 2019/7/21 20:17
 */
@Getter
@Setter
@ToString
public class User implements Serializable {

    private String uname;
    private Integer age;

    private Date date;
}
