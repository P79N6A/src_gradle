package com.ss.android.medialib.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;

@Keep
public class EffectFileInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    String path;
    int type;

    public String getPath() {
        return this.path;
    }

    public int getType() {
        return this.type;
    }

    public EffectFileInfo(int i, String str) {
        this.type = i;
        this.path = str;
    }
}
