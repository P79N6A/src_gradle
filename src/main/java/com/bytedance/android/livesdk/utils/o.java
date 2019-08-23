package com.bytedance.android.livesdk.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17621a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, String> f17622b = new HashMap<>();

    public final o a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f17621a, false, 13661, new Class[]{String.class, String.class}, o.class)) {
            return (o) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f17621a, false, 13661, new Class[]{String.class, String.class}, o.class);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f17622b.put(str, str2);
        }
        return this;
    }
}
