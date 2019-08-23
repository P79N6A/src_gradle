package com.ss.android.ugc.aweme.choosemusic.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35817a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f35818b;

    /* renamed from: c  reason: collision with root package name */
    private final String f35819c;

    c(boolean z, String str) {
        this.f35818b = z;
        this.f35819c = str;
    }

    public final Object then(i iVar) {
        if (!PatchProxy.isSupport(new Object[]{iVar}, this, f35817a, false, 26739, new Class[]{i.class}, Object.class)) {
            return a.a(this.f35818b, this.f35819c, iVar);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35817a, false, 26739, new Class[]{i.class}, Object.class);
    }
}
