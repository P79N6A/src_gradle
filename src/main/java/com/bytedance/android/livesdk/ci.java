package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.g.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ci implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13565a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f13566b;

    /* renamed from: c  reason: collision with root package name */
    private final a f13567c;

    ci(StartLiveFragmentDefault startLiveFragmentDefault, a aVar) {
        this.f13566b = startLiveFragmentDefault;
        this.f13567c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13565a, false, 2958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f13565a, false, 2958, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f13566b;
        this.f13567c.a(Boolean.TRUE);
        startLiveFragmentDefault.q();
    }
}
