package com.ttnet.org.chromium.net.impl;

import android.support.annotation.Nullable;
import com.ttnet.org.chromium.base.VisibleForTesting;
import com.ttnet.org.chromium.net.RequestFinishedInfo;
import java.util.Date;

@VisibleForTesting
public final class CronetMetrics extends RequestFinishedInfo.Metrics {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mConnectEndMs;
    private final long mConnectStartMs;
    private final long mDnsEndMs;
    private final long mDnsStartMs;
    @Nullable
    private final String mPeerAddr;
    @Nullable
    private final Long mPeerPort;
    private final long mPushEndMs;
    private final long mPushStartMs;
    @Nullable
    private final Long mReceivedByteCount;
    private final long mRequestEndMs;
    private final long mRequestStartMs;
    private final long mResponseStartMs;
    private final long mSendingEndMs;
    private final long mSendingStartMs;
    @Nullable
    private final Long mSentByteCount;
    private final boolean mSocketReused;
    private final long mSslEndMs;
    private final long mSslStartMs;
    @Nullable
    private final Long mTotalTimeMs;
    @Nullable
    private final Long mTtfbMs;

    private static boolean checkOrder(long j, long j2) {
        return (j2 >= j && j != -1) || j2 == -1;
    }

    @Nullable
    public final String getPeerAddr() {
        return this.mPeerAddr;
    }

    @Nullable
    public final Long getPeerPort() {
        return this.mPeerPort;
    }

    @Nullable
    public final Long getReceivedByteCount() {
        return this.mReceivedByteCount;
    }

    @Nullable
    public final Long getSentByteCount() {
        return this.mSentByteCount;
    }

    @Nullable
    public final boolean getSocketReused() {
        return this.mSocketReused;
    }

    @Nullable
    public final Long getTotalTimeMs() {
        return this.mTotalTimeMs;
    }

    @Nullable
    public final Long getTtfbMs() {
        return this.mTtfbMs;
    }

    @Nullable
    public final Date getConnectEnd() {
        return toDate(this.mConnectEndMs);
    }

    @Nullable
    public final Date getConnectStart() {
        return toDate(this.mConnectStartMs);
    }

    @Nullable
    public final Date getDnsEnd() {
        return toDate(this.mDnsEndMs);
    }

    @Nullable
    public final Date getDnsStart() {
        return toDate(this.mDnsStartMs);
    }

    @Nullable
    public final Date getPushEnd() {
        return toDate(this.mPushEndMs);
    }

    @Nullable
    public final Date getPushStart() {
        return toDate(this.mPushStartMs);
    }

    @Nullable
    public final Date getRequestEnd() {
        return toDate(this.mRequestEndMs);
    }

    @Nullable
    public final Date getRequestStart() {
        return toDate(this.mRequestStartMs);
    }

    @Nullable
    public final Date getResponseStart() {
        return toDate(this.mResponseStartMs);
    }

    @Nullable
    public final Date getSendingEnd() {
        return toDate(this.mSendingEndMs);
    }

    @Nullable
    public final Date getSendingStart() {
        return toDate(this.mSendingStartMs);
    }

    @Nullable
    public final Date getSslEnd() {
        return toDate(this.mSslEndMs);
    }

    @Nullable
    public final Date getSslStart() {
        return toDate(this.mSslStartMs);
    }

    @Nullable
    private static Date toDate(long j) {
        if (j != -1) {
            return new Date(j);
        }
        return null;
    }

    public CronetMetrics(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable Long l4) {
        this.mTtfbMs = l;
        this.mTotalTimeMs = l2;
        this.mSentByteCount = l3;
        this.mReceivedByteCount = l4;
        this.mRequestStartMs = -1;
        this.mDnsStartMs = -1;
        this.mDnsEndMs = -1;
        this.mConnectStartMs = -1;
        this.mConnectEndMs = -1;
        this.mSslStartMs = -1;
        this.mSslEndMs = -1;
        this.mSendingStartMs = -1;
        this.mSendingEndMs = -1;
        this.mPushStartMs = -1;
        this.mPushEndMs = -1;
        this.mResponseStartMs = -1;
        this.mRequestEndMs = -1;
        this.mPeerAddr = "";
        this.mPeerPort = 0L;
    }

    public CronetMetrics(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16) {
        long j17 = j;
        long j18 = j9;
        long j19 = j12;
        long j20 = j13;
        this.mRequestStartMs = j17;
        this.mDnsStartMs = j2;
        this.mDnsEndMs = j3;
        this.mConnectStartMs = j4;
        this.mConnectEndMs = j5;
        this.mSslStartMs = j6;
        this.mSslEndMs = j7;
        this.mSendingStartMs = j8;
        this.mSendingEndMs = j18;
        this.mPushStartMs = j10;
        this.mPushEndMs = j11;
        this.mResponseStartMs = j19;
        this.mRequestEndMs = j20;
        this.mSocketReused = z;
        this.mSentByteCount = Long.valueOf(j14);
        this.mReceivedByteCount = Long.valueOf(j15);
        this.mPeerAddr = str;
        this.mPeerPort = Long.valueOf(j16);
        if (j18 == -1 || j19 == -1) {
            this.mTtfbMs = null;
        } else {
            this.mTtfbMs = Long.valueOf(j19 - j18);
        }
        if (j17 == -1 || j20 == -1) {
            this.mTotalTimeMs = null;
        } else {
            this.mTotalTimeMs = Long.valueOf(j20 - j17);
        }
    }
}
