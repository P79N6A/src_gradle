package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75907a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f75908b;

    l(Activity activity) {
        this.f75908b = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75907a, false, 87895, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f75907a, false, 87895, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        bi.a(this.f75908b);
    }
}
