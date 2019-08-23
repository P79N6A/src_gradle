package com.ss.android.ugc.aweme.qrcode.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.qrcode.e.b;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63356a;

    public final String a() {
        return "web";
    }

    public final boolean a(String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f63356a, false, 70410, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f63356a, false, 70410, new Class[]{String.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!b.c(str)) {
            return false;
        } else {
            com.ss.android.ugc.aweme.ag.h.a().a(str2);
            return true;
        }
    }
}
