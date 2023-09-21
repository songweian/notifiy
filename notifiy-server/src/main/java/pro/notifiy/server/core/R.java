package pro.notifiy.server.core;

public record R<T>(T data, Exception exception) {

    public static <T> R<T> ok(T data) {
        return new R<>(data, null);
    }

    public static <T> R<T> error(Exception exception) {
        return new R<>(null, exception);
    }

    public boolean isOk() {
        return exception == null;
    }

    public boolean isError() {
        return exception != null;
    }
}
