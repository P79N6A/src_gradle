package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class el implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13226a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f13227b = new el();

    private el() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13226a, false, 7476, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13226a, false, 7476, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StickerTipWidget.class.getSimpleName();
        ((Throwable) obj).getMessage();
    }
}
