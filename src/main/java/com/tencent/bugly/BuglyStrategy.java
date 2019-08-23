package com.tencent.bugly;

import java.util.Map;

public class BuglyStrategy {

    /* renamed from: a  reason: collision with root package name */
    private String f79224a;

    /* renamed from: b  reason: collision with root package name */
    private String f79225b;

    /* renamed from: c  reason: collision with root package name */
    private String f79226c;

    /* renamed from: d  reason: collision with root package name */
    private long f79227d;

    /* renamed from: e  reason: collision with root package name */
    private String f79228e;

    /* renamed from: f  reason: collision with root package name */
    private String f79229f;
    private boolean g = true;
    private boolean h = true;
    private boolean i = true;
    private Class<?> j;
    private boolean k = true;
    private boolean l = true;
    private boolean m = true;
    private boolean n;
    private a o;

    public static class a {
        public synchronized Map<String, String> onCrashHandleStart(int i, String str, String str2, String str3) {
            return null;
        }

        public synchronized byte[] onCrashHandleStart2GetExtraDatas(int i, String str, String str2, String str3) {
            return null;
        }
    }

    public boolean isReplaceOldChannel() {
        return this.l;
    }

    public synchronized long getAppReportDelay() {
        return this.f79227d;
    }

    public synchronized a getCrashHandleCallback() {
        return this.o;
    }

    public synchronized String getDeviceID() {
        return this.f79229f;
    }

    public synchronized String getLibBuglySOFilePath() {
        return this.f79228e;
    }

    public synchronized Class<?> getUserInfoActivity() {
        return this.j;
    }

    public synchronized boolean isBuglyLogUpload() {
        return this.k;
    }

    public synchronized boolean isEnableANRCrashMonitor() {
        return this.h;
    }

    public synchronized boolean isEnableNativeCrashMonitor() {
        return this.g;
    }

    public synchronized boolean isEnableUserInfo() {
        return this.i;
    }

    public synchronized boolean isUploadProcess() {
        return this.m;
    }

    public synchronized boolean recordUserInfoOnceADay() {
        return this.n;
    }

    public synchronized String getAppChannel() {
        if (this.f79225b == null) {
            return com.tencent.bugly.crashreport.common.info.a.b().l;
        }
        return this.f79225b;
    }

    public synchronized String getAppPackageName() {
        if (this.f79226c == null) {
            return com.tencent.bugly.crashreport.common.info.a.b().f79276c;
        }
        return this.f79226c;
    }

    public synchronized String getAppVersion() {
        if (this.f79224a == null) {
            return com.tencent.bugly.crashreport.common.info.a.b().j;
        }
        return this.f79224a;
    }

    public void setReplaceOldChannel(boolean z) {
        this.l = z;
    }

    public synchronized BuglyStrategy setAppChannel(String str) {
        this.f79225b = str;
        return this;
    }

    public synchronized BuglyStrategy setAppPackageName(String str) {
        this.f79226c = str;
        return this;
    }

    public synchronized BuglyStrategy setAppReportDelay(long j2) {
        this.f79227d = j2;
        return this;
    }

    public synchronized BuglyStrategy setAppVersion(String str) {
        this.f79224a = str;
        return this;
    }

    public synchronized BuglyStrategy setBuglyLogUpload(boolean z) {
        this.k = z;
        return this;
    }

    public synchronized BuglyStrategy setCrashHandleCallback(a aVar) {
        this.o = aVar;
        return this;
    }

    public synchronized BuglyStrategy setDeviceID(String str) {
        this.f79229f = str;
        return this;
    }

    public synchronized BuglyStrategy setEnableANRCrashMonitor(boolean z) {
        this.h = z;
        return this;
    }

    public synchronized BuglyStrategy setEnableNativeCrashMonitor(boolean z) {
        this.g = z;
        return this;
    }

    public synchronized BuglyStrategy setEnableUserInfo(boolean z) {
        this.i = z;
        return this;
    }

    public synchronized BuglyStrategy setLibBuglySOFilePath(String str) {
        this.f79228e = str;
        return this;
    }

    public synchronized BuglyStrategy setRecordUserInfoOnceADay(boolean z) {
        this.n = z;
        return this;
    }

    public synchronized BuglyStrategy setUploadProcess(boolean z) {
        this.m = z;
        return this;
    }

    public synchronized BuglyStrategy setUserInfoActivity(Class<?> cls) {
        this.j = cls;
        return this;
    }
}
