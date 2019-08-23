package com.bytedance.android.livesdk.widget;

import android.content.DialogInterface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18570a;

    /* renamed from: b  reason: collision with root package name */
    private final u f18571b;

    /* renamed from: c  reason: collision with root package name */
    private final DialogInterface.OnClickListener f18572c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18573d;

    w(u uVar, DialogInterface.OnClickListener onClickListener, int i) {
        this.f18571b = uVar;
        this.f18572c = onClickListener;
        this.f18573d = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18570a, false, 14631, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18570a, false, 14631, new Class[]{View.class}, Void.TYPE);
            return;
        }
        u uVar = this.f18571b;
        this.f18572c.onClick(uVar.f18564e, this.f18573d);
    }
}
