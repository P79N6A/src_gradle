package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.commonsdk.statistics.common.MLog;

public class StatTracer implements b {
    private static Context mContext;
    private final int MAX_REQUEST_LIMIT;
    private long firstActivateTime;
    private long lastRequestTime;
    public int mFailedRequest;
    private int mLastRequestLatency;
    public long mLastSuccessfulRequestTime;
    public int mSuccessfulRequest;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final StatTracer f80982a = new StatTracer();

        private a() {
        }
    }

    public long getLastReqTime() {
        return this.lastRequestTime;
    }

    public void onRequestEnd() {
        logRequestEnd();
    }

    public void onRequestFailed() {
        logFailedRequest();
    }

    public void onRequestStart() {
        logRequestStart();
    }

    public void logFailedRequest() {
        this.mFailedRequest++;
    }

    public void logRequestStart() {
        this.lastRequestTime = System.currentTimeMillis();
    }

    private StatTracer() {
        this.MAX_REQUEST_LIMIT = 3600000;
        init();
    }

    public int getLastRequestLatency() {
        if (this.mLastRequestLatency > 3600000) {
            return 3600000;
        }
        return this.mLastRequestLatency;
    }

    public boolean isFirstRequest() {
        if (this.mLastSuccessfulRequestTime == 0) {
            return true;
        }
        return false;
    }

    public void logRequestEnd() {
        this.mLastRequestLatency = (int) (System.currentTimeMillis() - this.lastRequestTime);
    }

    private void init() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(mContext);
        this.mSuccessfulRequest = sharedPreferences.getInt("successful_request", 0);
        this.mFailedRequest = sharedPreferences.getInt("failed_requests ", 0);
        this.mLastRequestLatency = sharedPreferences.getInt("last_request_spent_ms", 0);
        this.mLastSuccessfulRequestTime = sharedPreferences.getLong("last_request_time", 0);
        this.lastRequestTime = sharedPreferences.getLong("last_req", 0);
    }

    public long getFirstActivateTime() {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(mContext);
        this.firstActivateTime = PreferenceWrapper.getDefault(mContext).getLong("first_activate_time", 0);
        if (this.firstActivateTime == 0) {
            this.firstActivateTime = System.currentTimeMillis();
            sharedPreferences.edit().putLong("first_activate_time", this.firstActivateTime).commit();
        }
        return this.firstActivateTime;
    }

    public void saveSate() {
        PreferenceWrapper.getDefault(mContext).edit().putInt("successful_request", this.mSuccessfulRequest).putInt("failed_requests ", this.mFailedRequest).putInt("last_request_spent_ms", this.mLastRequestLatency).putLong("last_req", this.lastRequestTime).putLong("last_request_time", this.mLastSuccessfulRequestTime).commit();
    }

    public void onRequestSucceed(boolean z) {
        logSuccessfulRequest(z);
    }

    public void logSuccessfulRequest(boolean z) {
        this.mSuccessfulRequest++;
        if (z) {
            this.mLastSuccessfulRequestTime = this.lastRequestTime;
        }
    }

    public static StatTracer getInstance(Context context) {
        if (mContext == null) {
            if (context != null) {
                mContext = context.getApplicationContext();
            } else {
                MLog.e("inside StatTracer. please check context. context must not be null!");
            }
        }
        return a.f80982a;
    }
}
