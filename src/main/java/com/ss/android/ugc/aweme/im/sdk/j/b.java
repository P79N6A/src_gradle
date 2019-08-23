package com.ss.android.ugc.aweme.im.sdk.j;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.websocket.internal.a;

public final class b implements com.ss.android.websocket.b.c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51700a;

    private a b(a aVar) {
        a aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f51700a, false, 53997, new Class[]{a.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{aVar}, this, f51700a, false, 53997, new Class[]{a.class}, a.class);
        }
        try {
            aVar2 = new a();
            aVar2.f51697d = aVar.getMethod();
            aVar2.h = aVar.getPayload();
            aVar2.f51699f = aVar.getPayloadEncoding();
            aVar2.g = aVar.getPayloadType();
        } catch (Exception unused) {
            aVar2 = null;
        }
        return aVar2;
    }

    public final Object a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f51700a, false, 53996, new Class[]{a.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar}, this, f51700a, false, 53996, new Class[]{a.class}, Object.class);
        }
        a aVar2 = null;
        if (aVar.getMethod() == 1) {
            aVar2 = b(aVar);
        }
        return aVar2;
    }
}
