package com.bytedance.android.livesdk.m;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.m.b.c;
import com.bytedance.android.livesdk.m.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class j implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16381a;

    /* renamed from: b  reason: collision with root package name */
    private final f.a f16382b;

    /* renamed from: c  reason: collision with root package name */
    private final c f16383c;

    j(f.a aVar, c cVar) {
        this.f16382b = aVar;
        this.f16383c = cVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f16381a, false, 12631, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f16381a, false, 12631, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        f.a aVar = this.f16382b;
        this.f16383c.b();
    }
}
