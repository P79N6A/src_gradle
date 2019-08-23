package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ek implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13224a;

    /* renamed from: b  reason: collision with root package name */
    private final StickerTipWidget f13225b;

    ek(StickerTipWidget stickerTipWidget) {
        this.f13225b = stickerTipWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13224a, false, 7475, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13224a, false, 7475, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13225b.contentView.setVisibility(8);
    }
}
