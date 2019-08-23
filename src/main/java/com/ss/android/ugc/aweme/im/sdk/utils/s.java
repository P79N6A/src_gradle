package com.ss.android.ugc.aweme.im.sdk.utils;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.c;

public final /* synthetic */ class s implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52645a;

    /* renamed from: b  reason: collision with root package name */
    private final a f52646b;

    /* renamed from: c  reason: collision with root package name */
    private final int f52647c;

    s(a aVar, int i) {
        this.f52646b = aVar;
        this.f52647c = i;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f52645a, false, 53476, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f52645a, false, 53476, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f52646b;
        int i = this.f52647c;
        if (iVar == null || iVar.d() || iVar.e() == null) {
            aVar.a();
        } else {
            com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.a aVar2 = (com.ss.android.ugc.aweme.im.sdk.chat.input.gifsearch.c.a.a) iVar.e();
            if (aVar2.status_code != 0 || aVar2.f50599a == null) {
                aVar.a();
            } else {
                c cVar = aVar2.f50599a;
                if (i <= 0) {
                    aVar.b(cVar);
                } else {
                    aVar.a(cVar);
                }
            }
        }
        return null;
    }
}
