package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dd implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62629a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileMoreFragment f62630b;

    /* renamed from: c  reason: collision with root package name */
    private final int f62631c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62632d;

    dd(ProfileMoreFragment profileMoreFragment, int i, boolean z) {
        this.f62630b = profileMoreFragment;
        this.f62631c = i;
        this.f62632d = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62629a, false, 68871, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62629a, false, 68871, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62630b.a(this.f62631c, this.f62632d, dialogInterface, i);
    }
}
