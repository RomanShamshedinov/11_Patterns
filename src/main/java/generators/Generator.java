package generators;

public abstract class Generator<T> {

    public final T createItem(final int input) {
        return develop(input);
    }

    protected abstract T develop(int code);

}
