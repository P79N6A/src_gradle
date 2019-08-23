package com.bytedance.bdlocation.client;

import com.bytedance.bdlocation.BDLocation;

public class LocationTrace {
    private boolean isCache;
    private Throwable mError;
    private BDLocation mLocation;
    private long mStartTimeMs;
    private long mStopTimeMs;
    private final String mTag;

    public long getStartTimeMs() {
        return this.mStartTimeMs;
    }

    public long getTraceTimeMs() {
        return this.mStopTimeMs - this.mStartTimeMs;
    }

    public void endTrace() {
        this.mStopTimeMs = System.currentTimeMillis();
        BDLocationConfig.isDebug();
    }

    public void startTrace() {
        this.mStartTimeMs = System.currentTimeMillis();
        BDLocationConfig.isDebug();
    }

    public String toString() {
        return "LocationTrace{mTag='" + this.mTag + '\'' + ", mStartTimeMs=" + this.mStartTimeMs + ", isCache=" + this.isCache + ", mStopTimeMs=" + this.mStopTimeMs + ", mLocation=" + this.mLocation + ", mError=" + this.mError + '}';
    }

    public void addTraceInfo(BDLocation bDLocation) {
        this.mLocation = bDLocation;
    }

    public void setCacheTrace(boolean z) {
        this.isCache = z;
    }

    public LocationTrace(String str) {
        this.mTag = str;
    }

    public void addTraceInfo(Throwable th) {
        this.mError = th;
    }
}
