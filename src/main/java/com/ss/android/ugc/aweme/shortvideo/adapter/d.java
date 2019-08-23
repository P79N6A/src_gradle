package com.ss.android.ugc.aweme.shortvideo.adapter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.adapter.c;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65511a;

    /* renamed from: b  reason: collision with root package name */
    private final c f65512b;

    d(c cVar) {
        this.f65512b = cVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f65511a, false, 75018, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f65511a, false, 75018, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        c cVar = this.f65512b;
        c.a aVar = (c.a) obj;
        if (aVar != null) {
            switch (aVar.f65508a) {
                case 0:
                    cVar.f65506e++;
                    cVar.a(aVar.f65509b, true);
                    return;
                case 1:
                    cVar.f65506e--;
                    cVar.f65503b.b(aVar.f65509b);
                    return;
                case 2:
                    cVar.a(4, false);
                    cVar.a(3, false);
                    cVar.a(11, false);
                    cVar.a(7, false);
                    cVar.a(14, cVar.k);
                    return;
                case 3:
                    cVar.a(7, true);
                    cVar.a(3, cVar.h);
                    cVar.a(4, true);
                    cVar.a(11, cVar.i);
                    cVar.a(14, cVar.k);
                    break;
            }
        }
    }
}
