package com.bytedance.android.livesdk.chatroom.end;

import com.bytedance.android.livesdk.chatroom.end.LiveBroadcastEndFragment;
import com.bytedance.android.livesdk.utils.ai;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10107a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveBroadcastEndFragment.AnonymousClass6.AnonymousClass1 f10108b;

    g(LiveBroadcastEndFragment.AnonymousClass6.AnonymousClass1 r1) {
        this.f10108b = r1;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10107a, false, 4252, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10107a, false, 4252, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        LiveBroadcastEndFragment.AnonymousClass6.AnonymousClass1 r3 = this.f10108b;
        Integer num = (Integer) obj;
        if (num.equals(2)) {
            LiveBroadcastEndFragment.this.b();
        } else if (num.equals(1)) {
            ai.a((int) C0906R.string.diy);
        } else {
            ai.a((int) C0906R.string.dix);
        }
    }
}
