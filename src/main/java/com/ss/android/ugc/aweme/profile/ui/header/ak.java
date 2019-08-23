package com.ss.android.ugc.aweme.profile.ui.header;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ak implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62853a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f62854b;

    /* renamed from: c  reason: collision with root package name */
    private final View f62855c;

    ak(aa aaVar, View view) {
        this.f62854b = aaVar;
        this.f62855c = view;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f62853a, false, 69596, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62853a, false, 69596, new Class[0], Void.TYPE);
            return;
        }
        this.f62854b.o(this.f62855c);
    }
}
