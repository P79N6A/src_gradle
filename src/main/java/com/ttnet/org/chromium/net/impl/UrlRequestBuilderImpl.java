package com.ttnet.org.chromium.net.impl;

import android.util.Pair;
import com.ttnet.org.chromium.net.ExperimentalUrlRequest;
import com.ttnet.org.chromium.net.UploadDataProvider;
import com.ttnet.org.chromium.net.UrlRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;

public class UrlRequestBuilderImpl extends ExperimentalUrlRequest.Builder {
    private static final String TAG = "UrlRequestBuilderImpl";
    private boolean mAllowDirectExecutor = false;
    private final UrlRequest.Callback mCallback;
    private final CronetEngineBase mCronetEngine;
    private boolean mDisableCache;
    private boolean mDisableConnectionMigration;
    private final Executor mExecutor;
    private String mMethod;
    private int mPriority = 3;
    private Collection<Object> mRequestAnnotations;
    private final ArrayList<Pair<String, String>> mRequestHeaders = new ArrayList<>();
    private int mRequestTimeout = 0;
    private int mSocketConnectTimeout = 0;
    private int mSocketReadTimeout = 0;
    private int mSocketWriteTimeout = 0;
    private UploadDataProvider mUploadDataProvider;
    private Executor mUploadDataProviderExecutor;
    private final String mUrl;

    public UrlRequestBuilderImpl allowDirectExecutor() {
        this.mAllowDirectExecutor = true;
        return this;
    }

    public UrlRequestBuilderImpl disableCache() {
        this.mDisableCache = true;
        return this;
    }

    public UrlRequestBuilderImpl disableConnectionMigration() {
        this.mDisableConnectionMigration = true;
        return this;
    }

    public UrlRequestBase build() {
        UrlRequestBase createRequest = this.mCronetEngine.createRequest(this.mUrl, this.mCallback, this.mExecutor, this.mPriority, this.mRequestAnnotations, this.mDisableCache, this.mDisableConnectionMigration, this.mAllowDirectExecutor);
        if (this.mMethod != null) {
            createRequest.setHttpMethod(this.mMethod);
        }
        Iterator<Pair<String, String>> it2 = this.mRequestHeaders.iterator();
        while (it2.hasNext()) {
            Pair next = it2.next();
            createRequest.addHeader((String) next.first, (String) next.second);
        }
        if (this.mUploadDataProvider != null) {
            createRequest.setUploadDataProvider(this.mUploadDataProvider, this.mUploadDataProviderExecutor);
        }
        createRequest.setSocketConnectTimeout(this.mSocketConnectTimeout);
        createRequest.setSocketReadTimeout(this.mSocketReadTimeout);
        createRequest.setSocketWriteTimeout(this.mSocketWriteTimeout);
        createRequest.setRequestTimeout(this.mRequestTimeout);
        return createRequest;
    }

    public UrlRequestBuilderImpl setPriority(int i) {
        this.mPriority = i;
        return this;
    }

    public UrlRequestBuilderImpl setRequestTimeout(int i) {
        this.mRequestTimeout = i;
        return this;
    }

    public UrlRequestBuilderImpl setSocketConnectTimeout(int i) {
        this.mSocketConnectTimeout = i;
        return this;
    }

    public UrlRequestBuilderImpl setSocketReadTimeout(int i) {
        this.mSocketReadTimeout = i;
        return this;
    }

    public UrlRequestBuilderImpl setSocketWriteTimeout(int i) {
        this.mSocketWriteTimeout = i;
        return this;
    }

    public ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        if (str != null) {
            this.mMethod = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    public UrlRequestBuilderImpl addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.mRequestAnnotations == null) {
                this.mRequestAnnotations = new ArrayList();
            }
            this.mRequestAnnotations.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    public UrlRequestBuilderImpl addHeader(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 != null) {
            this.mRequestHeaders.add(Pair.create(str, str2));
            return this;
        } else {
            throw new NullPointerException("Invalid header value.");
        }
    }

    public UrlRequestBuilderImpl setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        } else if (executor != null) {
            if (this.mMethod == null) {
                this.mMethod = "POST";
            }
            this.mUploadDataProvider = uploadDataProvider;
            this.mUploadDataProviderExecutor = executor;
            return this;
        } else {
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
    }

    UrlRequestBuilderImpl(String str, UrlRequest.Callback callback, Executor executor, CronetEngineBase cronetEngineBase) {
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
