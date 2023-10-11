package pro.justmine.result;

public interface PairResult<R, E> extends Result {

    R data();

    E error();

    default boolean isError() {
        return error() != null;
    }

    default boolean isSuccess() {
        return !isError();
    }

}
