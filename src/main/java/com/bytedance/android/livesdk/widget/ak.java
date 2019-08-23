package com.bytedance.android.livesdk.widget;

import android.content.DialogInterface;
import com.bytedance.android.livesdkapi.depend.g.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ak implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18434a;

    /* renamed from: b  reason: collision with root package name */
    private final aa f18435b;

    /* renamed from: c  reason: collision with root package name */
    private final a f18436c;

    ak(aa aaVar, a aVar) {
        this.f18435b = aaVar;
        this.f18436c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f18434a, false, 14698, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f18434a, false, 14698, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        aa aaVar = this.f18435b;
        this.f18436c.a(Boolean.TRUE);
        aaVar.f();
    }
}
