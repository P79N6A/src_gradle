package com.ss.android.ugc.aweme.net.a;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56858a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f56859b;

    /* renamed from: c  reason: collision with root package name */
    private final p f56860c;

    m(Runnable runnable, p pVar) {
        this.f56859b = runnable;
        this.f56860c = pVar;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f56858a, false, 60901, new Class[]{i.class}, Object.class)) {
            return j.a(this.f56859b, this.f56860c);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f56858a, false, 60901, new Class[]{i.class}, Object.class);
    }
}
