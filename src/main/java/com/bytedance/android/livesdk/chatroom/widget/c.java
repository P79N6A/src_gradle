package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class c implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13470a;

    /* renamed from: b  reason: collision with root package name */
    public static final Consumer f13471b = new c();

    private c() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13470a, false, 7803, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13470a, false, 7803, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a.c("ChooseLiveModeView", ((Throwable) obj).getMessage());
    }
}
