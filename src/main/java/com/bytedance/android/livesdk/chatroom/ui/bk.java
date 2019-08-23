package com.bytedance.android.livesdk.chatroom.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bk implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11936a;

    /* renamed from: b  reason: collision with root package name */
    private final LandscapeInteractionFragment f11937b;

    bk(LandscapeInteractionFragment landscapeInteractionFragment) {
        this.f11937b = landscapeInteractionFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11936a, false, 5823, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11936a, false, 5823, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LandscapeInteractionFragment landscapeInteractionFragment = this.f11937b;
        if (landscapeInteractionFragment.T == 0) {
            landscapeInteractionFragment.b(8);
        }
    }
}
