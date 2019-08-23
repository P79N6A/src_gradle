package com.ttnet.org.chromium.net.impl;

import android.annotation.SuppressLint;
import com.ttnet.org.chromium.net.BidirectionalStream;
import com.ttnet.org.chromium.net.ExperimentalBidirectionalStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Executor;

public class BidirectionalStreamBuilderImpl extends ExperimentalBidirectionalStream.Builder {
    private final BidirectionalStream.Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private boolean mDelayRequestHeadersUntilFirstFlush;
    private final Executor mExecutor;
    private String mHttpMethod = "POST";
    private int mPriority = 3;
    private Collection<Object> mRequestAnnotations;
    private final ArrayList<Map.Entry<String, String>> mRequestHeaders = new ArrayList<>();
    private final String mUrl;

    @SuppressLint({"WrongConstant"})
    public ExperimentalBidirectionalStream build() {
        return this.mCronetEngine.createBidirectionalStream(this.mUrl, this.mCallback, this.mExecutor, this.mHttpMethod, this.mRequestHeaders, this.mPriority, this.mDelayRequestHeadersUntilFirstFlush, this.mRequestAnnotations);
    }

    public BidirectionalStreamBuilderImpl delayRequestHeadersUntilFirstFlush(boolean z) {
        this.mDelayRequestHeadersUntilFirstFlush = z;
        return this;
    }

    public BidirectionalStreamBuilderImpl setPriority(int i) {
        this.mPriority = i;
        return this;
    }

    public ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.mRequestAnnotations == null) {
                this.mRequestAnnotations = new ArrayList();
            }
            this.mRequestAnnotations.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    public BidirectionalStreamBuilderImpl setHttpMethod(String str) {
        if (str != null) {
            this.mHttpMethod = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    public BidirectionalStreamBuilderImpl addHeader(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 != null) {
            this.mRequestHeaders.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            return this;
        } else {
            throw new NullPointerException("Invalid header value.");
        }
    }

    BidirectionalStreamBuilderImpl(String str, BidirectionalStream.Callback callback, Executor executor, CronetEngineBase cronetEngineBase) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (callback == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required.");
        } else if (cronetEngineBase != null) {
            this.mUrl = str;
            this.mCallback = callback;
            this.mExecutor = executor;
            this.mCronetEngine = cronetEngineBase;
        } else {
            throw new NullPointerException("CronetEngine is required.");
        }
    }
}
