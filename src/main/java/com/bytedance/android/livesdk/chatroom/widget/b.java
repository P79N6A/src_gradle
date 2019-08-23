package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class b implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13468a;

    /* renamed from: b  reason: collision with root package name */
    private final a f13469b;

    public b(a aVar) {
        this.f13469b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13468a, false, 7802, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13468a, false, 7802, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13469b.a((h) ((d) obj).f7871b, true);
    }
}
