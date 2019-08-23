package com.ss.android.ugc.aweme.discover.helper;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42331a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f42332b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f42333c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f42334d;

    /* renamed from: e  reason: collision with root package name */
    private static Boolean f42335e;

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f42331a, true, 36317, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f42331a, true, 36317, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (f42335e == null) {
            f42335e = (Boolean) SharePrefCache.inst().getIsHotSearchBillboardEnable().c();
        }
        return f42335e.booleanValue();
    }
}
