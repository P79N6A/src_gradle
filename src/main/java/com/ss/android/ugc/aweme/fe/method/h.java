package com.ss.android.ugc.aweme.fe.method;

import a.g;
import a.i;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44590a;

    /* renamed from: b  reason: collision with root package name */
    private final ZhimaMethod f44591b;

    /* renamed from: c  reason: collision with root package name */
    private final String f44592c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f44593d;

    h(ZhimaMethod zhimaMethod, String str, Context context) {
        this.f44591b = zhimaMethod;
        this.f44592c = str;
        this.f44593d = context;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f44590a, false, 39843, new Class[]{i.class}, Object.class)) {
            return this.f44591b.a(this.f44592c, this.f44593d, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f44590a, false, 39843, new Class[]{i.class}, Object.class);
    }
}
