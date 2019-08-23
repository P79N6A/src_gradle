package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13156a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveShareWidget.a f13157b;

    dg(LiveShareWidget.a aVar) {
        this.f13157b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13156a, false, 7260, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13156a, false, 7260, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveShareWidget.a aVar = this.f13157b;
        if (aVar.f12667b != null && aVar.f12667b.f()) {
            aVar.f12667b.dismiss();
        }
    }
}
