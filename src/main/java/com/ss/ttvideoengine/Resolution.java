package com.ss.ttvideoengine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public enum Resolution {
    Undefine("-1"),
    Standard("360p"),
    High("480p"),
    SuperHigh("720p");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String resolution;

    public final String toString() {
        return this.resolution;
    }

    public static Resolution[] getAllResolutions() {
        return new Resolution[]{Standard, High, SuperHigh};
    }

    public final int getIndex() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91327, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91327, new Class[0], Integer.TYPE)).intValue();
        }
        switch (this) {
            case High:
                i = 1;
                break;
            case SuperHigh:
                i = 2;
                break;
        }
        return i;
    }

    private Resolution(String str) {
        this.resolution = str;
    }
}
