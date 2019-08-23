package com.ss.android.ugc.aweme.profile.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.bi;

public final /* synthetic */ class cc implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62569a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileCoverPreviewActivity f62570b;

    cc(ProfileCoverPreviewActivity profileCoverPreviewActivity) {
        this.f62570b = profileCoverPreviewActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62569a, false, 68654, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62569a, false, 68654, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bi.a(this.f62570b);
    }
}
