package com.ss.android.ugc.aweme.crossplatform.business;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.activity.e;
import com.ss.android.ugc.aweme.crossplatform.view.h;

public final /* synthetic */ class i implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40788a;

    /* renamed from: b  reason: collision with root package name */
    private final h f40789b;

    /* renamed from: c  reason: collision with root package name */
    private final String f40790c;

    i(h hVar, String str) {
        this.f40789b = hVar;
        this.f40790c = str;
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f40788a, false, 34260, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f40788a, false, 34260, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        h hVar = this.f40789b;
        String str = this.f40790c;
        if (j >= 0) {
            hVar.a().a(j, str);
            hVar.a().a(str);
        }
    }
}
