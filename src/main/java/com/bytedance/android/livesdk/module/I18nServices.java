package com.bytedance.android.livesdk.module;

import android.support.annotation.Keep;
import com.bytedance.android.live.c.a;
import com.bytedance.android.live.utility.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class I18nServices implements a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public I18nServices() {
        b.a(a.class, this);
    }

    public String getI18nString(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 12500, new Class[]{String.class}, String.class)) {
            return com.bytedance.android.livesdk.i18n.b.a().a(str2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 12500, new Class[]{String.class}, String.class);
    }
}
