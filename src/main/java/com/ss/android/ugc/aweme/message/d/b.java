package com.ss.android.ugc.aweme.message.d;

import com.alibaba.fastjson.JSON;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.message.model.LiveMessage;
import com.ss.android.websocket.internal.a;

public final class b implements com.ss.android.websocket.b.c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55375a;

    public final Object a(a aVar) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f55375a, false, 58772, new Class[]{a.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar}, this, f55375a, false, 58772, new Class[]{a.class}, Object.class);
        }
        try {
            obj = JSON.parseObject(new String(aVar.getPayload()), LiveMessage.class);
        } catch (Throwable unused) {
            obj = null;
        }
        return obj;
    }
}
