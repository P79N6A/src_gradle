package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13269a;

    /* renamed from: b  reason: collision with root package name */
    private final BottomRightBannerWidget f13270b;

    h(BottomRightBannerWidget bottomRightBannerWidget) {
        this.f13270b = bottomRightBannerWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13269a, false, 6587, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13269a, false, 6587, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13270b.a((Throwable) obj);
    }
}
