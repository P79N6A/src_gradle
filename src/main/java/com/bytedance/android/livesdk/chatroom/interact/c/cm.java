package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.base.model.user.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cm implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10506a;

    /* renamed from: b  reason: collision with root package name */
    private final cl f10507b;

    cm(cl clVar) {
        this.f10507b = clVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10506a, false, 4783, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10506a, false, 4783, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10507b.f10499b.lambda$put$1$DataCenter("data_guest_user", User.from((User) obj));
    }
}
