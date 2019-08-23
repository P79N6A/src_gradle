package com.ss.android.ugc.aweme.survey;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.ies.dmt.ui.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74497a;

    public final int a() {
        return C0906R.layout.a9e;
    }

    public a(ViewStub viewStub) {
        super(viewStub);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f74497a, false, 86678, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f74497a, false, 86678, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        b.a(this.f74521f, 0.75f);
        b.a(this.g, 0.75f);
    }
}
