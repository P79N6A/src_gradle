package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fx implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10717a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10718b;

    public fx(fl flVar) {
        this.f10718b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10717a, false, 4964, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10717a, false, 4964, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10718b.f10690d.lambda$put$1$DataCenter("cmd_log_link", "REJECT_ANOTHER_GAME_SUCCEED");
    }
}
