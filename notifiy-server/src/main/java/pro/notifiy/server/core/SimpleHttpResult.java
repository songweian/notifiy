package pro.notifiy.server.core;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class SimpleHttpResult<T> {
    private String code;
    private String message;

    public SimpleHttpResult() {
    }

    public SimpleHttpResult(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
