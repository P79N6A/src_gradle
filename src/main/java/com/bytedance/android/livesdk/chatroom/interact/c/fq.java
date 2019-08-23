package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10703a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10704b;

    fq(fl flVar) {
        this.f10704b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10703a, false, 4957, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10703a, false, 4957, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        fl flVar = this.f10704b;
        flVar.b((Throwable) obj);
        flVar.f10690d.lambda$put$1$DataCenter("cmd_stop_interact", Boolean.TRUE);
    }
}
