package com.ss.android.ugc.aweme.app.application.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.d.d;

public final class c implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2641a;

    public final void a(boolean z) {
    }

    public final void a(boolean z, boolean z2) {
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f2641a, false, 23240, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f2641a, false, 23240, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            a.a(d.f33931b);
        }
    }
}
