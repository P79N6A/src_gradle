package com.bytedance.android.livesdk.widget;

import android.content.DialogInterface;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class v implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18566a;

    /* renamed from: b  reason: collision with root package name */
    private final u f18567b;

    /* renamed from: c  reason: collision with root package name */
    private final DialogInterface.OnClickListener f18568c;

    /* renamed from: d  reason: collision with root package name */
    private final int f18569d;

    v(u uVar, DialogInterface.OnClickListener onClickListener, int i) {
        this.f18567b = uVar;
        this.f18568c = onClickListener;
        this.f18569d = i;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18566a, false, 14630, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18566a, false, 14630, new Class[]{View.class}, Void.TYPE);
            return;
        }
        u uVar = this.f18567b;
        this.f18568c.onClick(uVar.f18564e, this.f18569d);
    }
}
