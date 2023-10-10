package pro.notifiy.server.common;

public interface HttpResult {

    boolean isSuccess();

    default boolean isError() {
        return !isSuccess();
    }

    String getErrorMessage();

}
