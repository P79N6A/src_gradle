package com.bytedance.android.livesdk.chatroom.interact.d;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.chatroom.interact.d.a;
import com.bytedance.android.livesdk.chatroom.model.a.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class f implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10849a;

    /* renamed from: b  reason: collision with root package name */
    private final a f10850b;

    f(a aVar) {
        this.f10850b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10849a, false, 5050, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10849a, false, 5050, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f10850b;
        aVar.f10836b = false;
        List<j> list = ((c) obj).f7867b;
        if (list.isEmpty()) {
            aVar.j.clear();
        } else {
            aVar.j = list;
        }
        for (a.C0089a b2 : aVar.g) {
            b2.b(aVar.j);
        }
    }
}
