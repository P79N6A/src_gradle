package com.bytedance.android.livesdk.s;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdkapi.service.a;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17127a;

    /* renamed from: b  reason: collision with root package name */
    private final a f17128b;

    g(a aVar) {
        this.f17128b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17127a, false, 12897, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17127a, false, 12897, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f17128b;
        c cVar = (c) obj;
        if (!Lists.isEmpty(cVar.f7867b)) {
            com.bytedance.android.livesdk.live.model.a aVar2 = (com.bytedance.android.livesdk.live.model.a) cVar.f7867b.get(0);
            if (aVar2 != null) {
                aVar.a(aVar2.f15857b);
            }
        }
    }
}
