package com.ttnet.org.chromium.net.impl;

import android.support.annotation.Nullable;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import com.ttnet.org.chromium.net.UrlResponseInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Collections;

public class RequestFinishedInfoImpl extends RequestFinishedInfo {
    private final Collection<Object> mAnnotations;
    @Nullable
    private final CronetException mException;
    private final int mFinishedReason;
    private final RequestFinishedInfo.Metrics mMetrics;
    @Nullable
    private final UrlResponseInfo mResponseInfo;
    private final String mUrl;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FinishedReason {
    }

    @Nullable
    public CronetException getException() {
        return this.mException;
    }

    public int getFinishedReason() {
        return this.mFinishedReason;
    }

    public RequestFinishedInfo.Metrics getMetrics() {
        return this.mMetrics;
    }

    @Nullable
    public UrlResponseInfo getResponseInfo() {
        return this.mResponseInfo;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public Collection<Object> getAnnotations() {
        if (this.mAnnotations == null) {
            return Collections.emptyList();
        }
        return this.mAnnotations;
    }

    public RequestFinishedInfoImpl(String str, Collection<Object> collection, RequestFinishedInfo.Metrics metrics, int i, @Nullable UrlResponseInfo urlResponseInfo, @Nullable CronetException cronetException) {
        this.mUrl = str;
        this.mAnnotations = collection;
        this.mMetrics = metrics;
        this.mFinishedReason = i;
        this.mResponseInfo = urlResponseInfo;
        this.mException = cronetException;
    }
}
