package com.ss.ttm.player;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TTLowMemoryCallback2 implements ComponentCallbacks2 {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mLevel = -1;
    private String mPath;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90765, new Class[0], Void.TYPE);
            return;
        }
        TTCrashUtil.saveLowMemoryInfo(this.mLevel, this.mPath);
    }

    public TTLowMemoryCallback2(String str) {
        this.mPath = str;
    }

    public void onTrimMemory(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90766, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 90766, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == 5) {
            this.mLevel = i;
        } else if (i == 10) {
            this.mLevel = i;
        } else if (i == 15) {
            this.mLevel = i;
        } else if (i == 20) {
            this.mLevel = i;
        } else if (i == 40) {
            this.mLevel = i;
        } else if (i == 60) {
            this.mLevel = i;
        } else if (i == 80) {
            this.mLevel = i;
        }
        TTCrashUtil.saveLowMemoryInfo(this.mLevel, this.mPath);
    }
}
