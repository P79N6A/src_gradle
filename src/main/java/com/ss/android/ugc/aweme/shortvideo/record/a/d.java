package com.ss.android.ugc.aweme.shortvideo.record.a;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.x;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69074a;

    /* renamed from: b  reason: collision with root package name */
    private final b f69075b;

    public d(b bVar) {
        this.f69075b = bVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f69074a, false, 78424, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f69074a, false, 78424, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        b bVar = this.f69075b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            bVar.f69061b.z.a((Object) bVar.f69061b, (bc) x.a((Object) bVar.v));
        }
    }
}
