package com.bytedance.android.livesdk.widget;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class am implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18439a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18440b;

    am(aa aaVar) {
        this.f18440b = aaVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f18439a, false, 14700, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f18439a, false, 14700, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        aa aaVar = this.f18440b;
        Boolean bool = (Boolean) obj;
        aaVar.h.setChecked(bool.booleanValue());
        if (bool.booleanValue() && !aaVar.p) {
            aaVar.p = true;
            aaVar.h.postDelayed(new ae(aaVar), 300);
        }
    }
}
