package com.bytedance.android.livesdk.m;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.m.b.c;
import com.bytedance.android.livesdk.m.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16374a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f16375b;

    /* renamed from: c  reason: collision with root package name */
    private final c f16376c;

    g(f.a aVar, c cVar) {
        this.f16375b = aVar;
        this.f16376c = cVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16374a, false, 12628, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f16374a, false, 12628, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        f.a aVar = this.f16375b;
        this.f16376c.a();
    }
}
