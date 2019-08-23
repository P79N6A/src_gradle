package com.ss.android.ugc.aweme.commercialize.f;

import com.alibaba.fastjson.JSON;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.coupon.model.CouponMessage;
import com.ss.android.websocket.b.c.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38684a;

    public final Object a(com.ss.android.websocket.internal.a aVar) {
        Object obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f38684a, false, 33195, new Class[]{com.ss.android.websocket.internal.a.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar}, this, f38684a, false, 33195, new Class[]{com.ss.android.websocket.internal.a.class}, Object.class);
        }
        try {
            obj = JSON.parseObject(new String(aVar.getPayload()), CouponMessage.class);
        } catch (Throwable unused) {
            obj = null;
        }
        return obj;
    }
}
