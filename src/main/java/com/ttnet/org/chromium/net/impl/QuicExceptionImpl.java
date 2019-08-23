package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.QuicException;

public class QuicExceptionImpl extends QuicException {
    private final NetworkExceptionImpl mNetworkException;
    private final int mQuicDetailedErrorCode;

    public int getQuicDetailedErrorCode() {
        return this.mQuicDetailedErrorCode;
    }

    public int getCronetInternalErrorCode() {
        return this.mNetworkException.getCronetInternalErrorCode();
    }

    public int getErrorCode() {
        return this.mNetworkException.getErrorCode();
    }

    public boolean immediatelyRetryable() {
        return this.mNetworkException.immediatelyRetryable();
    }

    public String getMessage() {
        return this.mNetworkException.getMessage() + ", QuicDetailedErrorCode=" + this.mQuicDetailedErrorCode;
    }

    public QuicExceptionImpl(String str, int i, int i2) {
        super(str, null);
        this.mNetworkException = new NetworkExceptionImpl(str, 10, i);
        this.mQuicDetailedErrorCode = i2;
    }
}
