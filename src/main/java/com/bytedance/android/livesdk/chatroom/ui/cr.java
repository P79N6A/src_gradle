package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.i.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class cr implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12034a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveProfileDetailFragment f12035b;

    cr(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f12035b = liveProfileDetailFragment;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f12034a, false, 6117, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f12034a, false, 6117, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveProfileDetailFragment liveProfileDetailFragment = this.f12035b;
        if (((a) obj) != null) {
            liveProfileDetailFragment.b(liveProfileDetailFragment.r);
        }
    }
}
