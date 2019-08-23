package com.ss.android.ugc.aweme.mobile.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56087a;

    /* renamed from: b  reason: collision with root package name */
    private String f56088b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56089c = true;

    public c(String str) {
        this.f56088b = str;
    }

    public final void a(Context context, String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f56087a, false, 59733, new Class[]{Context.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f56087a, false, 59733, new Class[]{Context.class, String.class}, Void.TYPE);
            return;
        }
        a.a(context2, this.f56088b, str2);
    }
}
