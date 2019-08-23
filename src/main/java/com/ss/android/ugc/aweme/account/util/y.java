package com.ss.android.ugc.aweme.account.util;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class y implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33126a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33127b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33128c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33129d;

    y(String str, int i, boolean z) {
        this.f33127b = str;
        this.f33128c = i;
        this.f33129d = z;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f33126a, false, 21456, new Class[]{i.class}, Object.class)) {
            return r.a(this.f33127b, this.f33128c, this.f33129d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f33126a, false, 21456, new Class[]{i.class}, Object.class);
    }
}
