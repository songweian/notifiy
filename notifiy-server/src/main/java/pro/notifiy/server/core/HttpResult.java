package pro.notifiy.server.core;

import lombok.Getter;

@Getter
public class HttpResult {

    protected final String code;
    protected final String message;

    public HttpResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static <T> DataHttpResult<T> ok(T data) {
        return new DataHttpResult<>("200", "OK", data);
    }

    public static HttpResult ok() {
        return new HttpResult("200", "OK");
    }

    public static HttpResult error500() {
        return new HttpResult("500", "Internal Server Error");
    }

    public static HttpResult error400() {
        return new HttpResult("400", "client request invalid");
    }

    public static HttpResult error404() {
        return new HttpResult("404", "RESOURCE NOT FOUND");
    }

    public static HttpResult error(String code, String message) {
        return new HttpResult(code, message);
    }

}
