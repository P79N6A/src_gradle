package com.ss.android.ugc.aweme.shortvideo.filter.func;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67743a;

    /* renamed from: b  reason: collision with root package name */
    private final RecordFilterModuleImpl f67744b;

    public f(RecordFilterModuleImpl recordFilterModuleImpl) {
        this.f67744b = recordFilterModuleImpl;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67743a, false, 77301, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67743a, false, 77301, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        RecordFilterModuleImpl recordFilterModuleImpl = this.f67744b;
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            recordFilterModuleImpl.h();
        }
    }
}
