package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdkapi.depend.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12032a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12033b;

    cq(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f12033b = liveProfileDetailFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12032a, false, 6116, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12032a, false, 6116, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f12033b.onEvent((a) obj);
    }
}
