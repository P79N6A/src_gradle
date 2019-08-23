package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.ui.AbsInteractionFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class w implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12305a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsInteractionFragment.AnonymousClass11 f12306b;

    w(AbsInteractionFragment.AnonymousClass11 r1) {
        this.f12306b = r1;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12305a, false, 5592, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12305a, false, 5592, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f12306b.a((User) obj);
    }
}
