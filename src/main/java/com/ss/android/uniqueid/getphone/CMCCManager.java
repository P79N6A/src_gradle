package com.ss.android.uniqueid.getphone;

import android.content.Context;
import android.os.Handler;
import com.bytedance.usergrowth.data.a.a.e;
import com.bytedance.usergrowth.data.a.a.g;
import com.bytedance.usergrowth.data.a.b.d;
import com.bytedance.usergrowth.data.a.c;

public class CMCCManager {
    private static d<CMCCManager> sInstance = new d<CMCCManager>() {
        public final /* synthetic */ Object a() {
            return new CMCCManager();
        }
    };
    private long mDelayTime;
    private String mKey = "8013818520";
    private int mRetryTimes = 1;
    private String mSecret = "oT5zHGhP2vQBB0Mv8T7voio4tm0fGrrC";

    public String getKey() {
        return this.mKey;
    }

    public int getRetryTimes() {
        return this.mRetryTimes;
    }

    public String getSecret() {
        return this.mSecret;
    }

    CMCCManager() {
    }

    public static CMCCManager inst() {
        return (CMCCManager) sInstance.b();
    }

    public e getLogPrinter() {
        return (e) c.a(e.class);
    }

    public g getNetClient() {
        return (g) c.a(g.class);
    }

    /* access modifiers changed from: package-private */
    public void log(String str) {
        getLogPrinter();
    }

    public void setDelay(long j) {
        this.mDelayTime = j;
    }

    public void setRetryTimes(int i) {
        this.mRetryTimes = i;
    }

    /* access modifiers changed from: package-private */
    public void submitRunnable(Runnable runnable) {
        ((com.bytedance.usergrowth.data.a.a.d) c.a(com.bytedance.usergrowth.data.a.a.d.class)).execute(runnable);
    }

    public void execute(Context context, String str, String str2) {
        this.mKey = str;
        this.mSecret = str2;
        Handler handler = new Handler();
        if (this.mDelayTime >= 0) {
            handler.postDelayed(new d(context.getApplicationContext()), this.mDelayTime);
        }
    }
}
