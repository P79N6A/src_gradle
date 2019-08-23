package com.ss.android.ugc.aweme.profile.ui.header;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;

public final /* synthetic */ class ag implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62843a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f62844b;

    /* renamed from: c  reason: collision with root package name */
    private final FollowStatus f62845c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f62846d;

    ag(aa aaVar, FollowStatus followStatus, boolean z) {
        this.f62844b = aaVar;
        this.f62845c = followStatus;
        this.f62846d = z;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f62843a, false, 69592, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f62843a, false, 69592, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        this.f62844b.a(this.f62845c, this.f62846d);
    }
}
