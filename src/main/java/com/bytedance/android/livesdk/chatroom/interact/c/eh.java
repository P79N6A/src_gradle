package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class eh implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10616a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10617b;

    eh(ec ecVar) {
        this.f10617b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10616a, false, 4878, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10616a, false, 4878, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10617b;
        ecVar.b((Throwable) obj);
        ecVar.g = false;
        if (ecVar.p != null) {
            ecVar.p.e();
        }
    }
}