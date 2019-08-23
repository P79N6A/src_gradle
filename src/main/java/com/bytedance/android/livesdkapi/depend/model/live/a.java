package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public enum a {
    VIDEO("general", false, true),
    AUDIO("general", false, false),
    THIRD_PARTY("thirdparty", true, false),
    SCREEN_RECORD("game", true, false);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("isStreamingBackground")
    public final boolean isStreamingBackground;
    @SerializedName("isUsingCamera")
    public final boolean isUsingCamera;
    @SerializedName("logStreamingType")
    public final String logStreamingType;

    public static a valueOf(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 14981, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 14981, new Class[]{Integer.TYPE}, a.class);
        } else if (i2 < 0 || i2 >= values().length) {
            return VIDEO;
        } else {
            return values()[i2];
        }
    }

    private a(String str, boolean z, boolean z2) {
        this.logStreamingType = str;
        this.isStreamingBackground = z;
        this.isUsingCamera = z2;
    }
}
