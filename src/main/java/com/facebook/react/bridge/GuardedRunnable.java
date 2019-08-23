package com.facebook.react.bridge;

public abstract class GuardedRunnable implements Runnable {
    private final ReactContext mReactContext;

    public abstract void runGuarded();

    public final void run() {
        try {
            runGuarded();
        } catch (RuntimeException e2) {
            this.mReactContext.handleException(e2);
        }
    }

    public GuardedRunnable(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }
}
