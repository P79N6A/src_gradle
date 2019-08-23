package com.bytedance.android.livesdk.sticker.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17387a;

    /* renamed from: b  reason: collision with root package name */
    private final b f17388b;

    e(b bVar) {
        this.f17388b = bVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17387a, false, 13451, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17387a, false, 13451, new Class[]{View.class}, Void.TYPE);
            return;
        }
        b bVar = this.f17388b;
        bVar.f17378d.b();
        bVar.a();
    }
}
