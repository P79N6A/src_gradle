package com.ss.ttvideoengine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TTVideoEnginePlayItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long expire;
    public String playURL;
    public Resolution resolution;
    public String vid;

    public boolean isExpired() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91453, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91453, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (System.currentTimeMillis() / 1000 > this.expire) {
            return true;
        } else {
            return false;
        }
    }
}
