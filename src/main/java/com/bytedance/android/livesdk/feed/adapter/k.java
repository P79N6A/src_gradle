package com.bytedance.android.livesdk.feed.adapter;

import android.arch.lifecycle.Observer;
import com.bytedance.android.live.core.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13980a;

    /* renamed from: b  reason: collision with root package name */
    private final c f13981b;

    public k(c cVar) {
        this.f13981b = cVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13980a, false, 8502, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13980a, false, 8502, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f13981b;
        Integer num = (Integer) obj;
        if (num != null && cVar.f13954c != null) {
            ab.a(cVar.f13954c, 0);
            if (cVar.f13955d.f()) {
                ab.a(cVar.f13954c, num.intValue());
            } else {
                cVar.f13954c.scrollToPosition(num.intValue());
            }
        }
    }
}
