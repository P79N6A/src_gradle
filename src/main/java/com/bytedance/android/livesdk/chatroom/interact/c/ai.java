package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ai implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10373a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10374b = new ai();

    private ai() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10373a, false, 4675, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10373a, false, 4675, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.a(6, "InteractDialogPKMatchPresenter", ((Throwable) obj).getStackTrace());
    }
}
