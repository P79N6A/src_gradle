package com.ss.android.ugc.aweme.message.d;

import com.alibaba.fastjson.JSON;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.websocket.b.c.b;
import com.ss.android.websocket.internal.a;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55376a;

    public final Object a(a aVar) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f55376a, false, 58773, new Class[]{a.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar}, this, f55376a, false, 58773, new Class[]{a.class}, Object.class);
        }
        Class cls = null;
        for (a a2 : d.a().f55379b) {
            cls = a2.a(aVar.getMethod());
            if (cls != null) {
                break;
            }
        }
        if (cls == null) {
            return null;
        }
        try {
            obj = JSON.parseObject(new String(aVar.getPayload()), cls);
        } catch (Throwable unused) {
            obj = null;
        }
        return obj;
    }
}
