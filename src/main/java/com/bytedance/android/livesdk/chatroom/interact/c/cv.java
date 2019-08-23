package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.livesdk.chatroom.interact.c.cl;
import com.bytedance.android.livesdk.chatroom.interact.t;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cv implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10524a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10525b;

    cv(cl clVar) {
        this.f10525b = clVar;
    }

    public final void accept(Object obj) {
        Object th;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10524a, false, 4792, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10524a, false, 4792, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cl clVar = this.f10525b;
        Throwable th2 = (Throwable) obj;
        clVar.b(th2);
        ((cl.a) clVar.b()).c();
        if (th2 instanceof a) {
            th = Integer.valueOf(((a) th2).getErrorCode());
        } else {
            th = th2.toString();
        }
        t.a(1, 201, th, "anchor", PushConstants.URI_PACKAGE_NAME, clVar.h().toString());
    }
}
