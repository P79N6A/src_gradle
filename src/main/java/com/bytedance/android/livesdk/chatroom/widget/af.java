package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import com.bytedance.android.livesdk.popup.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class af implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13436a;

    /* renamed from: b  reason: collision with root package name */
    private final d f13437b;

    af(d dVar) {
        this.f13437b = dVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f13436a, false, 7991, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f13436a, false, 7991, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f13437b.dismiss();
    }
}
