package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class de implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12065a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDialogV2 f12066b;

    de(LiveProfileDialogV2 liveProfileDialogV2) {
        this.f12066b = liveProfileDialogV2;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12065a, false, 6172, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12065a, false, 6172, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        Throwable th = (Throwable) obj;
        this.f12066b.o = false;
    }
}
