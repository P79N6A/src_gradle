package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.interact.model.a;
import com.bytedance.android.livesdk.utils.ah;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bt implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10456a;

    /* renamed from: b  reason: collision with root package name */
    static final Consumer f10457b = new bt();

    private bt() {
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10456a, false, 4735, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10456a, false, 4735, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        d dVar = (d) obj;
        b.aw.a(Integer.valueOf(((a) dVar.f7871b).f10972a));
        b.i.a(Integer.valueOf(((a) dVar.f7871b).f10973b));
        b.k.a(ah.b(System.currentTimeMillis()));
    }
}
