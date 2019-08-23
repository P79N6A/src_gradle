package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fz implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10721a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10722b;

    fz(fl flVar) {
        this.f10722b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10721a, false, 4966, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10721a, false, 4966, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10722b.f10690d.lambda$put$1$DataCenter("cmd_log_link", "OPEN_BATTLE_SUCCEED");
    }
}
