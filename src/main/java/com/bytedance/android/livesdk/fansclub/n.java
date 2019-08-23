package com.bytedance.android.livesdk.fansclub;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class n implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13898a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveFansClubEntryWidget f13899b;

    n(LiveFansClubEntryWidget liveFansClubEntryWidget) {
        this.f13899b = liveFansClubEntryWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13898a, false, 8344, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13898a, false, 8344, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveFansClubEntryWidget liveFansClubEntryWidget = this.f13899b;
        b bVar = (b) obj;
        if (bVar != null) {
            liveFansClubEntryWidget.h = bVar.f13872a;
        }
    }
}
