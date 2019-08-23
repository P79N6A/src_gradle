package com.ss.ttm.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AVUri {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mType;
    private String mUri;

    public int getType() {
        return this.mType;
    }

    public String getUri() {
        return this.mUri;
    }

    public static AVUri get(String str) {
        String str2 = str;
        int i = 1;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 91146, new Class[]{String.class}, AVUri.class)) {
            return (AVUri) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 91146, new Class[]{String.class}, AVUri.class);
        } else if (str2 == null) {
            return null;
        } else {
            if (str2.startsWith("rtmp")) {
                i = 0;
            } else if (!str2.startsWith("rtsp")) {
                if (str2.startsWith("file")) {
                    i = 2;
                } else if (!str2.startsWith("http")) {
                    return null;
                } else {
                    i = 3;
                }
            }
            return new AVUri(i, str2);
        }
    }

    public AVUri(int i, String str) {
        this.mType = i;
        this.mUri = str;
    }
}
