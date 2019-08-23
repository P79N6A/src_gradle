package com.ss.android.ugc.aweme.store;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.store.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71742a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile long f71743b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile long f71744c;

    public static String a(String str, d.a aVar) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, aVar}, null, f71742a, true, 82102, new Class[]{String.class, d.a.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, aVar}, null, f71742a, true, 82102, new Class[]{String.class, d.a.class}, String.class);
        }
        return aVar.name() + "_" + str2;
    }
}
