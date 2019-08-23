package com.ss.android.ugc.aweme.profile.ui.header;

import android.os.Bundle;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.f;

public final /* synthetic */ class al implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62856a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f62857b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62858c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62859d;

    al(aa aaVar, View view, boolean z) {
        this.f62857b = aaVar;
        this.f62858c = view;
        this.f62859d = z;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62856a, false, 69597, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62856a, false, 69597, new Class[0], Void.TYPE);
            return;
        }
        this.f62857b.b(this.f62858c, this.f62859d);
    }

    public final void a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f62856a, false, 69598, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f62856a, false, 69598, new Class[]{Bundle.class}, Void.TYPE);
        }
    }
}
