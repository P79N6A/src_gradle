package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class al implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11835a;

    /* renamed from: b  reason: collision with root package name */
    private final aj f11836b;

    al(aj ajVar) {
        this.f11836b = ajVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11835a, false, 5666, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11835a, false, 5666, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f11836b.a((h) ((d) obj).f7871b, true);
    }
}
