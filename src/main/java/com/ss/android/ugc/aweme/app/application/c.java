package com.ss.android.ugc.aweme.app.application;

import android.content.Context;
import com.facebook.imageutils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.e.g;

public final /* synthetic */ class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33934a;

    /* renamed from: b  reason: collision with root package name */
    private final b f33935b;

    c(b bVar) {
        this.f33935b = bVar;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33934a, false, 23213, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f33934a, false, 23213, new Class[]{String.class}, Void.TYPE);
            return;
        }
        g.a((Context) this.f33935b.f4325d, str2);
    }
}
