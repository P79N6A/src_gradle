package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class fv implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10713a;

    /* renamed from: b  reason: collision with root package name */
    private final fl f10714b;

    public fv(fl flVar) {
        this.f10714b = flVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10713a, false, 4962, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10713a, false, 4962, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        fl flVar = this.f10714b;
        flVar.f10691e = false;
        flVar.f10690d.lambda$put$1$DataCenter("cmd_log_link", "INVITE_ANOTHER_GAME_SUCCEED");
    }
}
