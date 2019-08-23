package com.bytedance.android.live.base.model.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class a implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String douPlusEntry;
    public boolean hasDouPlusEntry;

    public static a defaultOne() {
        if (PatchProxy.isSupport(new Object[0], null, changeQuickRedirect, true, 46, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, changeQuickRedirect, true, 46, new Class[0], a.class);
        }
        return new a(false, "");
    }

    public a(boolean z, String str) {
        this.hasDouPlusEntry = z;
        this.douPlusEntry = str;
    }
}
