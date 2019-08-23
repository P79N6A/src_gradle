package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.live.d.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ag implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12971a;

    /* renamed from: b  reason: collision with root package name */
    private final GiftWidget f12972b;

    ag(GiftWidget giftWidget) {
        this.f12972b = giftWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12971a, false, 6904, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12971a, false, 6904, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        GiftWidget giftWidget = this.f12972b;
        b bVar = (b) obj;
        if (giftWidget.f12554e != null) {
            giftWidget.f12554e.a(bVar);
        }
    }
}
