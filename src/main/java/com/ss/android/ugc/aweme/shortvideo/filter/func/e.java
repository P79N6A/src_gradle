package com.ss.android.ugc.aweme.shortvideo.filter.func;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.shortvideo.j.d;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67740a;

    /* renamed from: b  reason: collision with root package name */
    private final RecordFilterModuleImpl f67741b;

    /* renamed from: c  reason: collision with root package name */
    private final d f67742c;

    e(RecordFilterModuleImpl recordFilterModuleImpl, d dVar) {
        this.f67741b = recordFilterModuleImpl;
        this.f67742c = dVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67740a, false, 77300, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67740a, false, 77300, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RecordFilterModuleImpl recordFilterModuleImpl = this.f67741b;
        d dVar = this.f67742c;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            dVar.a("");
        }
        recordFilterModuleImpl.i = bool.booleanValue();
        a.L.a(e.a.DisableFilter, bool.booleanValue());
    }
}
