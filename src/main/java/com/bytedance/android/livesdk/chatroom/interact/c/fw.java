package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fw implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10715a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10716b;

    public fw(fl flVar) {
        this.f10716b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10715a, false, 4963, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10715a, false, 4963, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        fl flVar = this.f10716b;
        flVar.b((Throwable) obj);
        flVar.f10691e = false;
    }
}
