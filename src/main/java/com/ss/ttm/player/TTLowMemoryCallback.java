package com.ss.ttm.player;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TTLowMemoryCallback implements ComponentCallbacks {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mPath;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 90764, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 90764, new Class[0], Void.TYPE);
            return;
        }
        TTCrashUtil.saveLowMemoryInfo(-1, this.mPath);
    }

    public TTLowMemoryCallback(String str) {
        this.mPath = str;
    }
}
