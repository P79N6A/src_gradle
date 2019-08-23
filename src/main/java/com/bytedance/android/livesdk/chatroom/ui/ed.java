package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ed implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12134a;

    /* renamed from: b  reason: collision with root package name */
    private final dy f12135b;

    /* renamed from: c  reason: collision with root package name */
    private final w f12136c;

    ed(dy dyVar, w wVar) {
        this.f12135b = dyVar;
        this.f12136c = wVar;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12134a, false, 6265, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12134a, false, 6265, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f12135b.a(this.f12136c);
    }
}
