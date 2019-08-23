package com.ss.android.ugc.aweme.shortvideo.edit;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bd implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67097a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity f67098b;

    bd(VEVideoPublishEditActivity vEVideoPublishEditActivity) {
        this.f67098b = vEVideoPublishEditActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f67097a, false, 76480, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f67097a, false, 76480, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f67098b.X();
    }
}
