package com.bytedance.android.livesdk.fansclub;

import android.arch.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.KVData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class r implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13907a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveFansClubEntryWidget f13908b;

    r(LiveFansClubEntryWidget liveFansClubEntryWidget) {
        this.f13908b = liveFansClubEntryWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13907a, false, 8348, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13907a, false, 8348, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13908b.a((KVData) obj);
    }
}
