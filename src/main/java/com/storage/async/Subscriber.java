package com.storage.async;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public interface Subscriber<T> {

    public static class NoConcernSubscriber<T> implements Subscriber<T> {
        public void onError(@NonNull Throwable th) {
        }

        public void onSuccess() {
        }

        public void onSuccess(@Nullable T t) {
        }
    }

    public static abstract class ResultLessSubscriber<T> implements Subscriber<T> {
        public void onSuccess(@Nullable T t) {
        }
    }

    public static abstract class ResultableSubscriber<T> implements Subscriber<T> {
        public void onSuccess() {
        }
    }

    void onError(@NonNull Throwable th);

    void onSuccess();

    void onSuccess(@Nullable T t);
}
