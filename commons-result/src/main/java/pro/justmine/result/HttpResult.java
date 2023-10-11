package pro.justmine.result;

public interface HttpResult extends Result {

    boolean isSuccess();

    default boolean isError() {
        return !isSuccess();
    }

    default String getErrorMessage() {
        return "";
    }
}
