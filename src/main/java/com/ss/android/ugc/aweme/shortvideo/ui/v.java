package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70929a;

    /* renamed from: b  reason: collision with root package name */
    private final PublishPermissionFragment f70930b;

    /* renamed from: c  reason: collision with root package name */
    private final int f70931c;

    v(PublishPermissionFragment publishPermissionFragment, int i) {
        this.f70930b = publishPermissionFragment;
        this.f70931c = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70929a, false, 80304, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f70929a, false, 80304, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        PublishPermissionFragment publishPermissionFragment = this.f70930b;
        int i2 = this.f70931c;
        publishPermissionFragment.f70539d = i2;
        publishPermissionFragment.a(i2);
        dialogInterface.dismiss();
        publishPermissionFragment.a();
    }
}
