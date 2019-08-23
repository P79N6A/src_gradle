package com.ss.android.ugc.aweme.profile.d;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61455a;

    /* renamed from: b  reason: collision with root package name */
    private final j f61456b;

    k(j jVar) {
        this.f61456b = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61455a, false, 69956, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f61455a, false, 69956, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f61456b.e();
    }
}
