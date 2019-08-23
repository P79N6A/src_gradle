package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.chatroom.widget.CountDownView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class m implements CountDownView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12283a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment f12284b;

    m(AbsInteractionFragment absInteractionFragment) {
        this.f12284b = absInteractionFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f12283a, false, 5567, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12283a, false, 5567, new Class[0], Void.TYPE);
            return;
        }
        AbsInteractionFragment absInteractionFragment = this.f12284b;
        if (!absInteractionFragment.f11429f) {
            absInteractionFragment.a(3);
        } else {
            absInteractionFragment.f11428e = true;
        }
    }
}
