package android.support.v7.view.menu;

public class BaseWrapper<T> {
    final T mWrappedObject;

    public T getWrappedObject() {
        return this.mWrappedObject;
    }

    BaseWrapper(T t) {
        if (t != null) {
            this.mWrappedObject = t;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
}
