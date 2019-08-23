package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dl implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13168a;

    /* renamed from: b  reason: collision with root package name */
    private final LuckyBoxWidget f13169b;

    dl(LuckyBoxWidget luckyBoxWidget) {
        this.f13169b = luckyBoxWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13168a, false, 7281, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13168a, false, 7281, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13169b.a((Throwable) obj);
    }
}
