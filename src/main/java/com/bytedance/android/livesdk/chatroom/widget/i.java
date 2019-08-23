package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13496a;

    /* renamed from: b  reason: collision with root package name */
    private final h f13497b;

    i(h hVar) {
        this.f13497b = hVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13496a, false, 7842, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13496a, false, 7842, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13497b.dismiss();
    }
}
