package com.ss.android.common.applog;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28103a;

    public static long a() {
        if (PatchProxy.isSupport(new Object[0], null, f28103a, true, 15670, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f28103a, true, 15670, new Class[0], Long.TYPE)).longValue();
        }
        return System.currentTimeMillis();
    }

    public static long a(JSONObject jSONObject, String str) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, str}, null, f28103a, true, 15672, new Class[]{JSONObject.class, String.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{jSONObject, str}, null, f28103a, true, 15672, new Class[]{JSONObject.class, String.class}, Long.TYPE)).longValue();
        }
        long j = 0;
        try {
            j = Long.valueOf(jSONObject.optString(str)).longValue();
        } catch (NumberFormatException unused) {
        }
        return j;
    }
}
