package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ak implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11833a;

    /* renamed from: b  reason: collision with root package name */
    private final aj f11834b;

    ak(aj ajVar) {
        this.f11834b = ajVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11833a, false, 5665, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11833a, false, 5665, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f11834b.dismiss();
    }
}
