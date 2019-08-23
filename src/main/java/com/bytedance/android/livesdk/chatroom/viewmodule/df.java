package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget;
import com.bytedance.android.livesdk.popup.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class df implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13153a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveShareWidget.a f13154b;

    /* renamed from: c  reason: collision with root package name */
    private final View f13155c;

    df(LiveShareWidget.a aVar, View view) {
        this.f13154b = aVar;
        this.f13155c = view;
    }

    public final void a(View view, d dVar) {
        if (PatchProxy.isSupport(new Object[]{view, dVar}, this, f13153a, false, 7259, new Class[]{View.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dVar}, this, f13153a, false, 7259, new Class[]{View.class, d.class}, Void.TYPE);
            return;
        }
        view.setOnClickListener(new di(this.f13154b, dVar, this.f13155c));
    }
}
