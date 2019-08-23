package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dh implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13158a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveShareWidget.a f13159b;

    dh(LiveShareWidget.a aVar) {
        this.f13159b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13158a, false, 7261, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13158a, false, 7261, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveShareWidget.a aVar = this.f13159b;
        if (aVar.f12667b != null && aVar.f12667b.f()) {
            aVar.f12667b.dismiss();
        }
    }
}
