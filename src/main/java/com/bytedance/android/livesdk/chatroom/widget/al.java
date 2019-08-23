package com.bytedance.android.livesdk.chatroom.widget;

import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.w.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class al implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13448a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveRoomUserInfoWidget f13449b;

    al(LiveRoomUserInfoWidget liveRoomUserInfoWidget) {
        this.f13449b = liveRoomUserInfoWidget;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f13448a, false, 7997, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f13448a, false, 7997, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f13449b.a(ac.a((int) C0906R.string.d2f));
        b.Z.a(Boolean.TRUE);
    }
}
