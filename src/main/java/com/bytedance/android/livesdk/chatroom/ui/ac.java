package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ac implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11809a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment.g f11810b;

    ac(AbsInteractionFragment.g gVar) {
        this.f11810b = gVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11809a, false, 5634, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11809a, false, 5634, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        AbsInteractionFragment.g gVar = this.f11810b;
        if (gVar.f11487b != null && gVar.f11487b.f()) {
            gVar.f11487b.dismiss();
        }
    }
}
