package com.ss.android.ugc.aweme.o;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.widget.CanCancelRadioButton;
import com.ss.android.ugc.aweme.port.in.am;

public final /* synthetic */ class q implements CanCancelRadioButton.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58307a;

    /* renamed from: b  reason: collision with root package name */
    private final am.b f58308b;

    q(am.b bVar) {
        this.f58308b = bVar;
    }

    public final boolean a(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, this, f58307a, false, 54817, new Class[]{View.class}, Boolean.TYPE)) {
            return this.f58308b.a(view2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2}, this, f58307a, false, 54817, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
    }
}
