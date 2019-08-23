package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.ui.header.a;

public final /* synthetic */ class s implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62927a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass1 f62928b;

    s(a.AnonymousClass1 r1) {
        this.f62928b = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62927a, false, 69412, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62927a, false, 69412, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62928b.a(i);
    }
}
