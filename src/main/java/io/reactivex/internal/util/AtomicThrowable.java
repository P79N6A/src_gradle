package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public final Throwable terminate() {
        return ExceptionHelper.terminate(this);
    }

    public final boolean isTerminated() {
        if (get() == ExceptionHelper.TERMINATED) {
            return true;
        }
        return false;
    }

    public final boolean addThrowable(Throwable th) {
        return ExceptionHelper.addThrowable(this, th);
    }
}
