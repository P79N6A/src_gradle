package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.livesdk.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class ck implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12015a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveInputDialogFragment f12016b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12017c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12018d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12019e;

    ck(LiveInputDialogFragment liveInputDialogFragment, long j, int i, int i2) {
        this.f12016b = liveInputDialogFragment;
        this.f12017c = j;
        this.f12018d = i;
        this.f12019e = i2;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f12015a, false, 5977, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f12015a, false, 5977, new Class[0], Void.TYPE);
            return;
        }
        LiveInputDialogFragment liveInputDialogFragment = this.f12016b;
        long j = this.f12017c;
        int i = this.f12018d;
        int i2 = this.f12019e;
        if (liveInputDialogFragment.isResumed() && liveInputDialogFragment.n) {
            s.a(liveInputDialogFragment.getContext(), liveInputDialogFragment.f11583f);
            liveInputDialogFragment.a(j, i + 1, i2);
        }
    }
}
