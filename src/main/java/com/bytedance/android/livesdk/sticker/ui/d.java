package com.bytedance.android.livesdk.sticker.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17385a;

    /* renamed from: b  reason: collision with root package name */
    static final View.OnClickListener f17386b = new d();

    private d() {
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17385a, false, 13450, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17385a, false, 13450, new Class[]{View.class}, Void.TYPE);
        }
    }
}
