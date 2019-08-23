package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.popup.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ab implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11806a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment.g f11807b;

    /* renamed from: c  reason: collision with root package name */
    private final View f11808c;

    ab(AbsInteractionFragment.g gVar, View view) {
        this.f11807b = gVar;
        this.f11808c = view;
    }

    public final void a(View view, d dVar) {
        if (PatchProxy.isSupport(new Object[]{view, dVar}, this, f11806a, false, 5633, new Class[]{View.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, dVar}, this, f11806a, false, 5633, new Class[]{View.class, d.class}, Void.TYPE);
            return;
        }
        view.setOnClickListener(new ae(this.f11807b, dVar, this.f11808c));
    }
}
