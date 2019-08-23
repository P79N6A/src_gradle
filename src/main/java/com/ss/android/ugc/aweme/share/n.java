package com.ss.android.ugc.aweme.share;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.option.share.OnShareEventListener;

public final /* synthetic */ class n implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65218a;

    /* renamed from: b  reason: collision with root package name */
    private final e f65219b;

    /* renamed from: c  reason: collision with root package name */
    private final String f65220c;

    /* renamed from: d  reason: collision with root package name */
    private final OnShareEventListener f65221d;

    n(e eVar, String str, OnShareEventListener onShareEventListener) {
        this.f65219b = eVar;
        this.f65220c = str;
        this.f65221d = onShareEventListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65218a, false, 72945, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f65218a, false, 72945, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f65219b.a(this.f65220c, this.f65221d);
    }
}
