package pro.notifiy.server.core;

import lombok.Getter;

@Getter
public class DataHttpResult<T> extends HttpResult {

    private final T data;

    public DataHttpResult(String code, String message, T data) {
        super(code, message);
        this.data = data;
    }

}
