package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.service.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class bq implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9272a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9273b;

    bq(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9273b = startLiveFragmentDefault;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9272a, false, 2940, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9272a, false, 2940, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f9273b;
        startLiveFragmentDefault.startActivityForResult(((b) TTLiveSDKContext.getService(b.class)).p().a(startLiveFragmentDefault.f8846c), 23456);
    }
}
