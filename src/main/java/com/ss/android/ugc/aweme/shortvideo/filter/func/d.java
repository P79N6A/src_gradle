package com.ss.android.ugc.aweme.shortvideo.filter.func;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67738a;

    /* renamed from: b  reason: collision with root package name */
    private final RecordFilterModuleImpl f67739b;

    d(RecordFilterModuleImpl recordFilterModuleImpl) {
        this.f67739b = recordFilterModuleImpl;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67738a, false, 77299, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f67738a, false, 77299, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f67739b.o.a((List) obj, true);
    }
}
