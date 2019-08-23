package com.bytedance.android.livesdk.widget;

import com.bytedance.android.livesdkapi.d.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final /* synthetic */ class ab implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18415a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18416b;

    ab(aa aaVar) {
        this.f18416b = aaVar;
    }

    public final void a(List list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f18415a, false, 14689, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f18415a, false, 14689, new Class[]{List.class}, Void.TYPE);
            return;
        }
        aa aaVar = this.f18416b;
        if (list != null) {
            aaVar.n = list.size();
        }
    }
}
