package com.bytedance.android.livesdk.chatroom.ui;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.bytedance.android.livesdk.popup.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ae implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11813a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment.g f11814b;

    /* renamed from: c  reason: collision with root package name */
    private final d f11815c;

    /* renamed from: d  reason: collision with root package name */
    private final View f11816d;

    ae(AbsInteractionFragment.g gVar, d dVar, View view) {
        this.f11814b = gVar;
        this.f11815c = dVar;
        this.f11816d = view;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f11813a, false, 5636, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f11813a, false, 5636, new Class[]{View.class}, Void.TYPE);
            return;
        }
        AbsInteractionFragment.g gVar = this.f11814b;
        d dVar = this.f11815c;
        View view2 = this.f11816d;
        dVar.dismiss();
        gVar.onClick(view2);
    }
}
