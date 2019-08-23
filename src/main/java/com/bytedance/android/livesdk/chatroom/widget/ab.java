package com.bytedance.android.livesdk.chatroom.widget;

import android.view.View;
import com.bytedance.android.livesdk.popup.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ab implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13427a;

    /* renamed from: b  reason: collision with root package name */
    static final d.a f13428b = new ab();

    private ab() {
    }

    public final void a(View view, d dVar) {
        View view2 = view;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{view2, dVar2}, this, f13427a, false, 7987, new Class[]{View.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, dVar2}, this, f13427a, false, 7987, new Class[]{View.class, d.class}, Void.TYPE);
            return;
        }
        view2.setOnClickListener(new af(dVar2));
    }
}
