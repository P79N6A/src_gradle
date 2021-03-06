package com.ttnet.org.chromium.net;

import android.support.annotation.Nullable;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.Executor;

public abstract class RequestFinishedInfo {

    public static abstract class Listener {
        private final Executor mExecutor;

        public abstract void onRequestFinished(RequestFinishedInfo requestFinishedInfo);

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public Listener(Executor executor) {
            if (executor != null) {
                this.mExecutor = executor;
                return;
            }
            throw new IllegalStateException("Executor must not be null");
        }
    }

    public static abstract class Metrics {
        @Nullable
        public abstract Date getConnectEnd();

        @Nullable
        public abstract Date getConnectStart();

        @Nullable
        public abstract Date getDnsEnd();

        @Nullable
        public abstract Date getDnsStart();

        @Nullable
        public abstract String getPeerAddr();

        @Nullable
        public abstract Long getPeerPort();

        @Nullable
        public abstract Date getPushEnd();

        @Nullable
        public abstract Date getPushStart();

        @Nullable
        public abstract Long getReceivedByteCount();

        @Nullable
        public abstract Date getRequestEnd();

        @Nullable
        public abstract Date getRequestStart();

        @Nullable
        public abstract Date getResponseStart();

        @Nullable
        public abstract Date getSendingEnd();

        @Nullable
        public abstract Date getSendingStart();

        @Nullable
        public abstract Long getSentByteCount();

        @Nullable
        public abstract boolean getSocketReused();

        @Nullable
        public abstract Date getSslEnd();

        @Nullable
        public abstract Date getSslStart();

        @Nullable
        public abstract Long getTotalTimeMs();

        @Nullable
        public abstract Long getTtfbMs();
    }

    public abstract Collection<Object> getAnnotations();

    @Nullable
    public abstract CronetException getException();

    public abstract int getFinishedReason();

    public abstract Metrics getMetrics();

    @Nullable
    public abstract UrlResponseInfo getResponseInfo();

    public abstract String getUrl();
}
