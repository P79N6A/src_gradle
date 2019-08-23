package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fo implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10697a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10698b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f10699c;

    fo(fl flVar, boolean z) {
        this.f10698b = flVar;
        this.f10699c = z;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10697a, false, 4955, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10697a, false, 4955, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        fl flVar = this.f10698b;
        boolean z = this.f10699c;
        flVar.b((Throwable) obj);
        if (!z) {
            flVar.b(true);
        }
    }
}
