package com.bytedance.android.livesdk.chatroom.ui;

import android.os.Bundle;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class cn implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12025a;

    /* renamed from: b  reason: collision with root package name */
    private final LivePlayFragment f12026b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12027c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12028d;

    /* renamed from: e  reason: collision with root package name */
    private final Bundle f12029e;

    cn(LivePlayFragment livePlayFragment, long j, String str, Bundle bundle) {
        this.f12026b = livePlayFragment;
        this.f12027c = j;
        this.f12028d = str;
        this.f12029e = bundle;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12025a, false, 6058, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12025a, false, 6058, new Class[0], Void.TYPE);
            return;
        }
        LivePlayFragment livePlayFragment = this.f12026b;
        long j = this.f12027c;
        String str = this.f12028d;
        Bundle bundle = this.f12029e;
        livePlayFragment.a(LivePlayFragment.a.JUMP_TO_OTHER);
        if (livePlayFragment.p() != null) {
            livePlayFragment.p().a(j, str, bundle);
        }
    }
}
